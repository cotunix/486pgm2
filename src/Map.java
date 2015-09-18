import java.util.*;

public class Map {
	public Node[][] map;
	private int width, height, startingX, startingY;
	private Scanner fileIn;
	private boolean[][] letterMap;
	private double[][] costMap;	
	private int letters;

	public Map(String txtfile) {
		width = 0;
		height = 0;
		fileIn = new Scanner(txtfile);
	}

	public void buildMap() {
		try {
			width = fileIn.nextInt();
			height = fileIn.nextInt();

			startingX = fileIn.nextInt();
			startingY = Math.abs(fileIn.nextInt() - height - 1) ;

			for (int i = 0; i < width; i++) {
				for (int j = 0; j < height; j++) {
					if (fileIn.next().equals("X")){
						letterMap[i][j] = true;
						letters++;
					}
				}
			}
			for (int i = 0; i < width; i++) {
				for (int j = 0; j < height; j++) {					
						costMap[i][j] = fileIn.nextDouble();
				}
			}
		} catch (Exception e) {

		}
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {				
					map[i][j] = new Node(letterMap[i][j], costMap[i][j]);
			}
		}
		
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {				
					try {
						map[i][j].SetEast(map[i][j+1]);
					}
					catch (ArrayIndexOutOfBoundsException e){
						map[i][j].SetEast(null);
					}
					try {
						map[i][j].SetWest(map[i][j-1]);
					}
					catch (ArrayIndexOutOfBoundsException e){
						map[i][j].SetWest(null);
					}
					try {
						map[i][j].SetNorth(map[i-1][j]);
					}
					catch (ArrayIndexOutOfBoundsException e){
						map[i][j].SetNorth(null);
					}
					try {
						map[i][j].SetSouth(map[i+1][j]);
					}
					catch (ArrayIndexOutOfBoundsException e){
						map[i][j].SetSouth(null);
					}
					
			}
		}
		
	}
	
	public int getStartingX(){
		return startingX;
	}
	public int getStartingY(){
		return startingY;
	}
	public int getLetters(){
		return letters;
	}
	public int getHeight(){
		return height;
	}
	public int getWidth(){
		return width;
	}
}

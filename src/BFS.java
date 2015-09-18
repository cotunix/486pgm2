import java.util.ArrayList;

public class BFS {
	
	

	public static void main(String[] args) {
		Map m = new Map(args[0]);
		m.buildMap();
		ArrayList<Node> frontier = buildFrontier(m);
		Node temp = frontier.get(0);
		
	}

	public static ArrayList<Node> buildFrontier(Map m) {
		ArrayList<Node> frontier = new ArrayList<Node>();
		ArrayList<Node> explored = new ArrayList<Node>();
		
		
		frontier.add(m.map[m.getStartingX()][m.getStartingY()]);
		frontier.get(0).parent = "Start";
		Node temp;
		int letters = 0;
		while (!frontier.isEmpty()) {
			temp = frontier.get(0);
			frontier.remove(0);
			if (temp.isLetter())
				letters++;
			explored.add(temp);
			if (temp.getEast() != null && !frontier.contains(temp.getEast())) {
				if (temp.getEast().isLetter() && ((letters + 1) == m.getLetters()))
					
				frontier.add(temp.getEast());
				temp.getEast().parent = "East";
				
			}
			if (temp.getNorth() != null && !frontier.contains(temp.getNorth())) {
				frontier.add(temp.getNorth());
				
				
			}
			if (temp.getWest() != null && !frontier.contains(temp.getWest())) {
				frontier.add(temp.getWest());
				
				
			}
			if (temp.getSouth() != null && !frontier.contains(temp.getSouth())) {
				frontier.add(temp.getSouth());
				
				
			}
		
		}

		return frontier;
	}

}

public class Node {
	private Node north, south, east, west;	
	
	private boolean letter;
	private double cost;
	private boolean visited, explored;
	public int letters;
	public int runningCost;
	public String parent;

	public Node(boolean letter,
			double cost) {
		super();
	
		this.letter = letter;
		this.cost = cost;
	}
	
	public void SetNorth(Node node){
		
		north = node;
		
		
	}
	public void SetSouth(Node node){
		south = node;
	}
	public void SetEast(Node node){
		east = node;
	}
	public void SetWest(Node node){
		west = node;
	}

	public Node getNorth() {
		return north;
	}

	public Node getSouth() {
		return south;
	}

	public Node getWest() {
		return west;
	}

	public Node getEast() {
		return east;
	}

	public boolean isLetter() {
		return letter;
	}

	public double getCost() {
		return cost;
	}
	public void setVisited(boolean b){
		visited = b;
	}
	public boolean isVisited(){
		return visited;
	}
	public void setExplored(boolean b){
		explored = b;
	}
	public boolean isExplored(){
		return explored;
	}
}

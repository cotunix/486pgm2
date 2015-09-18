public class Node {
	private Node north, south, east, west;	
	private boolean letter;
	private double cost;

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
}

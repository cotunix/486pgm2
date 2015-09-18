public class Node {
	private Node north, south, east, west;	
	private boolean letter;
	private double cost;

	public Node(Node north, Node south, Node west, Node east, boolean letter,
			double cost) {
		super();
		this.north = north;
		this.south = south;
		this.west = west;
		this.east = east;
		this.letter = letter;
		this.cost = cost;
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

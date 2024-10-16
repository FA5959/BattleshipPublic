package standard;


public class Battleship {
	
	public static final int size = 10;
	
	static int distance(final Coordinate start, final Coordinate end) {
		int sum = Math.abs(start.column() - end.column()) + Math.abs(start.row() - end.row());
		return sum;
	}
	
	static Coordinate getRandomCoordinate() {
		int rndColumn = Utility.getRandomInt(size);
		int rndRow = Utility.getRandomInt(size);
		
		return new Coordinate(rndColumn, rndRow);
		
	}

}

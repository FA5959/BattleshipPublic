package standard;

public class Battleship {
	
	static int distance(final Coordinate start, final Coordinate end) {
		int sum = Math.abs(start.column() - end.column()) + Math.abs(start.row() - end.row());
		return sum;
	}

}

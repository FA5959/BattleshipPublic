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

	static boolean onOneLine(final Coordinate start, final Coordinate end) {
		/*if (start.column() == end.column() || start.row() == end.row())
			return true;
		else
			return false;*/
		return start.column() == end.column() || start.row() == end.row();
	}

	static void showSeparatorLine() {
		System.out.println("   +-+-+-+-+-+-+-+-+-+-+      +-+-+-+-+-+-+-+-+-+-+");
	}

	static int getMaxSurroundingColumn(final Coordinate start, final Coordinate end) {
		/*if (start.column() >= end.column()) {
			if (start.column() + 1 >= size) {
				return 9;
			} else
				return start.column() + 1;
		} else
			return end.column() + 1; */
		
		//int maxColumn = Math.max(start.column(), end.column());
		//return (maxColumn + 1 < size) ? maxColumn + 1 : maxColumn;
		return Math.min(size - 1, Math.max(start.column(), end.column()) + 1);
	}

	static int getMaxSurroundingRow(final Coordinate start, final Coordinate end) {
		/*if (start.row() >= end.row()) {
			if(start.row() + 1 >= size) {
				return 9;
			} else
				return start.row() + 1;
		} else
			return end.row() + 1; */
		
		//int maxRow = Math.max(start.row(), end.row());
		//return (maxRow + 1 < size) ? maxRow + 1 : maxRow;
		return Math.min(size - 1, Math.max(start.row(), end.row()) + 1);
	}

	static int getMinSurroundingColumn(final Coordinate start, final Coordinate end) {
		/*if (start.column() >= end.column()) {
			if(start.column() - 1 <= 0) {
				return 0;
			} else
				return end.column() - 1;
		} else
			return start.column() - 1;*/
		
		//int minColumn = Math.min(start.column(), end.column());
		//return (minColumn - 1 >= 0) ? minColumn - 1 : minColumn;
		return Math.max(0, Math.min(start.column(), end.column()) - 1);
	}

	static int getMinSurroundingRow(final Coordinate start, final Coordinate end) {
		/*if (start.row() > end.row()) {
			if(start.row() - 1 <= 0) {
				return 0;
			} else
				return end.row() - 1;
		} else
			return start.row() - 1;*/
		
		//int minRow = Math.min(start.row(), end.row());
		//return (minRow - 1 >= 0) ? minRow - 1 : minRow;
		return Math.max(0, Math.min(start.row(), end.row()) - 1);
	}

	
}

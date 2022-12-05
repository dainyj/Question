package p318;

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	Point() {
		this(0, 0);
	}

	String getXY() {
		return "(" + x + "," + y + ")";
	}
}
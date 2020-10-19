package fr.dauphine.ja.dourmarcellino.shapes;

public class Point {
	private int x;
	private int y;
	private static int nbPoint;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		Point.nbPoint++;
	}
	
	public Point(Point p) {
		this.x = p.getX();
		this.y = p.getY();
		Point.nbPoint++;
	}
	
	public static int getNbPoint() {
		return nbPoint;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public boolean isSameAs(Point p) {
		if (this.x == p.x && this.y == p.y) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this.isSameAs((Point) o)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	public void translate(int dx, int dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;
	}

	public static void main(String[] args) {
		Point p = new Point(1, 3);
		System.out.println(p.x + " " + p.y);
	}

}

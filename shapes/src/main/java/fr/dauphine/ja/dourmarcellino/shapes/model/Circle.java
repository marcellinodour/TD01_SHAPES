package fr.dauphine.ja.dourmarcellino.shapes.model;

public class Circle implements Shape {
	private Point centre;
	private int rayon;
	
	public Circle(Point p, int r) {
		centre = p;
		rayon = r;
	}

	public int getRayon() {
		return rayon;
	}

	public Point getCentre() {
		return centre;
	}
	
	@Override
	public String toString() {
		return "centre : " + this.centre.toString() + " rayon : " + this.rayon + " surface : " + surface();
	}
	
	public void translate(int dx, int dy) {
		this.centre.translate(dx, dy);
	}
	
	public double surface() {
		return 2 * 3.14 * this.rayon;
	}
	
	public boolean contains(Point p) {
		if(Math.pow((p.getX() - this.centre.getX()), 2) + Math.pow((p.getY() - this.centre.getY()), 2) < Math.pow(this.rayon, 2)) {
			return true;
		}
		return false;
	}
	
	public boolean contains(Point p, Circle...circles) {
		for(Circle c : circles) {
			if(c.contains(p)==true) {
				return true;
			}
		}
		return false;
	}

	public void setX(int x) {
		this.centre.setX(x);
	}

	public void setY(int y) {
		this.centre.setY(y);		
	}
}

package fr.dauphine.ja.dourmarcellino.shapes.model;

import java.util.LinkedList;

public class LigneBrisee implements Shape {
	private LinkedList<Point> tab;

	public LigneBrisee() {
		this.tab = new LinkedList<Point>();
	}

	public LinkedList<Point> getTab() {
		return tab;
	}

	public void add(Point p) {
		this.tab.add(p);
	}
	
	public int pointCapacity() {
		return this.tab.size();
	}
	
	public int nbPoint() {
		return this.tab.size();
	}
	
	public boolean contains(Point p) {
		return this.tab.contains(p);
	}

	public void setX(int x) {
		this.tab.get(0).setX(x);
	}

	public void setY(int y) {
		this.tab.get(0).setY(y);
	}

}

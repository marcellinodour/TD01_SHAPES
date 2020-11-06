package fr.dauphine.ja.dourmarcellino.shapes.model;

import java.util.LinkedList;
import java.util.Observable;

public class World extends Observable {
	private LinkedList<Shape> shapes;
	
	public World() {
		this.shapes = new LinkedList<Shape>();
	}

	public LinkedList<Shape> getShapes() {
		return shapes;
	}
	
	public void add(Shape s) {
		shapes.add(s);
	}
	
	public void changeWorld() {
		setChanged();
		notifyObservers();
	}

}

package fr.dauphine.ja.dourmarcellino.shapes;

import java.util.ArrayList;

public class TestPoint {

	public static void main(String[] args) {
		Circle c = new Circle(new Point(1, 2), 1);
		c.getCentre().translate(1, 1);
		Ring r = new Ring(new Point(1, 2), 1, 1);
		System.out.println(r);
	}

}

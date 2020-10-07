package fr.dauphine.ja.dourmarcellino.shapes;

import java.util.ArrayList;

public class TestPoint {

	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = p1;
		Point p3 = new Point(1, 2);
		
		
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
	}

}

package fr.dauphine.ja.dourmarcellino.shapes.view;

import java.awt.Graphics;

import fr.dauphine.ja.dourmarcellino.shapes.model.Circle;
import fr.dauphine.ja.dourmarcellino.shapes.model.LigneBrisee;
import fr.dauphine.ja.dourmarcellino.shapes.model.Point;
import fr.dauphine.ja.dourmarcellino.shapes.model.Ring;
import fr.dauphine.ja.dourmarcellino.shapes.model.Shape;

public class DrawShape {

	public static void draw(Graphics g, Shape s) {
		if(s.getClass() == Point.class) {
			draw(g, (Point) s);
		}else if (s.getClass() == Ring.class) {
			draw(g, (Ring) s);
		}else if (s.getClass() == Circle.class) {
			draw(g, (Circle) s);
		}else if (s.getClass() == LigneBrisee.class) {
			draw(g, (LigneBrisee) s);
		}else {
			System.out.println("Shape not found");
		}
	}
	
	private static void draw(Graphics G, Point p) {
		G.drawLine(p.getX(), p.getY(), p.getX(), p.getY());
	}
	
	private static void draw(Graphics G, Circle c) {
		G.drawOval(c.getCentre().getX() - c.getRayon(), c.getCentre().getY() - c.getRayon(), c.getRayon() * 2, c.getRayon() *2);
	}
	
	private static void draw(Graphics G, Ring r) {
		draw(G, r.getTrouDuMilieu());
		G.drawOval(r.getCentre().getX() - r.getRayon(), r.getCentre().getY() - r.getRayon(), r.getRayon() * 2, r.getRayon() * 2);
	}
	
	private static void draw(Graphics G, LigneBrisee l) {
		for(int i = 0 ; i < l.nbPoint() - 1; i++) {
			G.drawLine(l.getTab().get(i).getX(), l.getTab().get(i).getY(), l.getTab().get(i+1).getX(), l.getTab().get(i+1).getY());
		}
	}
}

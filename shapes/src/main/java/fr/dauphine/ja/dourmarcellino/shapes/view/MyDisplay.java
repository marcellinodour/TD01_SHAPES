package fr.dauphine.ja.dourmarcellino.shapes.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.MouseController;
import fr.dauphine.ja.dourmarcellino.shapes.model.Circle;
import fr.dauphine.ja.dourmarcellino.shapes.model.LigneBrisee;
import fr.dauphine.ja.dourmarcellino.shapes.model.Point;
import fr.dauphine.ja.dourmarcellino.shapes.model.Ring;
import fr.dauphine.ja.dourmarcellino.shapes.model.Shape;
import fr.dauphine.ja.dourmarcellino.shapes.model.World;

public class MyDisplay extends JPanel implements Observer{
	private World w;
	private static MouseController m;
	private static final long serialVersionUID = 6931653643315156826L;
	
	public MyDisplay() {
		this.w = new World();
		this.m = new MouseController(this);
		this.w.addObserver(this);
		this.addMouseMotionListener(this.m);
	}

	@Override
	public void paintComponent(Graphics G) {
		//G.drawLine(0, 0, 500, 500);
		super.paintComponent(G);
		for(Shape s : w.getShapes()) {
			DrawShape.draw(G, s);
		}
	}
	
	@SuppressWarnings("static-access")
	public static void main(String []args) {
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500, 500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Point p_1 = new Point(200, 200);
		Point p_2 = new Point(350, 200);
		Point p_3 = new Point(275, 450);
		LigneBrisee l = new LigneBrisee();
		Point p_4 = new Point(125, 200);
		Point p_5 = new Point(425, 200);
		
		l.add(p_4);
		l.add(p_3);
		l.add(p_5);

		Circle c_1 = new Circle(p_1, 75);
		Circle c_2 = new Circle(p_2, 75);
		
		Ring r = new Ring(new Point(1,1), 25, 50);
		
		MyDisplay d = new MyDisplay();
		d.w.add(l);
		d.w.add(c_1);
		d.w.add(c_2);
		d.w.add(r);
		
		frame.add(d);
		frame.setVisible(true);
	}

	public void update(Observable o, Object arg) {
		repaint();
	}

	public World getW() {
		return w;
	}

}

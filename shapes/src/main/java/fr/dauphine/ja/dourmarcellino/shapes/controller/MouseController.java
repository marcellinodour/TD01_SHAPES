package fr.dauphine.ja.dourmarcellino.shapes.controller;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import fr.dauphine.ja.dourmarcellino.shapes.model.Shape;
import fr.dauphine.ja.dourmarcellino.shapes.view.MyDisplay;

public class MouseController extends Frame implements MouseMotionListener {
	private static final long serialVersionUID = 1L;
	MyDisplay d;
	
	public MouseController(MyDisplay d) {
		addMouseMotionListener(this);
		setLayout(null);
		setVisible(true);
		this.d = d;
	}

	public void mouseDragged(MouseEvent e) {
		//TODO();
		
	}

	public void mouseMoved(MouseEvent e) {
		this.d.getW().getShapes().get(3).setX(e.getX());
		this.d.getW().getShapes().get(3).setY(e.getY());
		this.d.getW().changeWorld();
	}


}

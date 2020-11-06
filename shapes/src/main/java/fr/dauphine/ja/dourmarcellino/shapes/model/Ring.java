package fr.dauphine.ja.dourmarcellino.shapes.model;

public class Ring extends Circle implements Shape{
	private Circle trouDuMilieu;

	public Ring(Point p, int r, int r2) {
		super(p, r);
		trouDuMilieu = new Circle(p, r2);
	}

	public Circle getTrouDuMilieu() {
		return trouDuMilieu;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this.isSameAs((Ring) o)) {
			return true;
		}
		return false;
	}

	private boolean isSameAs(Ring o) {
		if(this.getCentre().equals(o.getCentre()) && 
				this.trouDuMilieu.getCentre().equals(o.trouDuMilieu.getCentre()) &&
						this.trouDuMilieu.getRayon() == o.trouDuMilieu.getRayon() &&
						this.getRayon() == o.getRayon()){
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		return "centre : " + this.getCentre().toString() + " rayon : " + this.getRayon() + " trou : " + this.trouDuMilieu.getRayon();
	}
	
	@Override
	public boolean contains(Point p) {
		if(!this.trouDuMilieu.contains(p) && this.contains(p, this)) {
			return true;
		}
		return false;
	}
	
	public boolean contains(Point p, Ring...rings) {
		for(Ring r : rings) {
			if(r.contains(p)==true) {
				return true;
			}
		}
		return false;
	}

}

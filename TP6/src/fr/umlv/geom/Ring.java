package fr.umlv.geom;
import java.lang.Math;

public class Ring extends Circle{
	
	// Attributes
	private int iRay;
	
	// Getter
	public int getIRay() {
		return this.iRay;
	}
	
	// Constructor
	public Ring(Point point, int ray, int iRay){
		super(point, ray);
		if(iRay >= ray) {
			throw new IllegalArgumentException("Erreur : le rayon interne n'est pas inférieur au rayon de l'anneau !");
		} this.iRay = iRay;
	}
	
	// Override toString 
	@Override
	public String toString() {
		return (super.toString() + ", internalRadius = " + iRay);
	}
	
	// Override surface
	@Override
	public double surface() {
		return (super.surface() - (Math.PI*this.iRay*this.iRay));
	}
	
	// Override contains
	@Override
	public boolean contains(Point p) {
		var internal = new Circle(super.getCenter(), iRay);
		if(internal.contains(p)) {
			return false;
		} return super.contains(p);
		
		/* OU
		double dist = getDistance(p);
		int ray = getRay();
		return dist <=ray*ray && dist> iRay*iRay;
		 */	
	}
	
	public boolean contains(Point p, Ring... rings) {
		for (Ring ring : rings) {
			if (ring.contains(p))
				return true;
		}
		return false;
	}
	
}

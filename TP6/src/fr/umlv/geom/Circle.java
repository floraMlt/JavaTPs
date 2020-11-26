package fr.umlv.geom;
import java.lang.Math;
public class Circle {
	
	// Attributes
	private Point point;
	private int ray;
	
	//Getters
	public Point getCenter() {
		return new Point(point.getX(), point.getY());
	}
	
	public int getRay() {
		return this.ray;
	}
	
	// Constructor
	public Circle(Point point, int ray) {
		this.point = new Point(point.getX(), point.getY());
		this.ray = ray;
	}
	
	// ToString method
	@Override
	public String toString() {
		return ("center = " + point + ", ray = " + ray + ", surface = " + surface());
	}
	
	// Translate method
	public void translate(int dx, int dy) {
		this.point.translate(dx, dy);
	}
	
	// Surface = pi*R²
	public double surface() {
		return Math.PI*(this.ray*this.ray);
	}
	
	double getDistance(Point p) {
		return Math.sqrt(Math.pow(p.getX()-point.getX(), 2)+(Math.pow(p.getY()-point.getY(), 2)));
	}
	
	// Circle contains a Point
	public boolean contains(Point p) {
		return this.getDistance(p) <= this.ray;
	}
	
	// Circles contain a Point
	public boolean contains(Point p, Circle... circles) {
		for(Circle c : circles) {
			if(c.contains(p)) {
				return true;
			}
		} return false;
	}

}

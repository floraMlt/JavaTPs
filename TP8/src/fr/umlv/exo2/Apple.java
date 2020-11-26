package fr.umlv.exo2;

import java.util.Objects;

public class Apple implements Fruit{	
	// attributs
	private final int price;
	//private String appleKind;
	private ApplesKind appleKind;
	private int weight;
	
	// constructeur
	
	// Question1
	/*public Apple(final int weight, final String appleKind) {
		this.weight = weight;
		this.appleKind = appleKind;
		price = price();
	}*/
	
	// Question 5
	public Apple(final int weight, final ApplesKind applesKind) {
		if(weight < 0) {
			throw new IllegalArgumentException("Le poids d'une pomme ne peut pas être négatif");
		}
		Objects.requireNonNull(applesKind, "Le type de pomme ne peut pas être null");
		this.weight = weight;
		this.appleKind = applesKind;
		price = price();
	}
		
	// méthodes
	@Override
	public String toString() {
		return "Apple " + appleKind + " " + Integer.toString(this.weight) + " g";
	}
	
	@Override
	public int price() {
		return this.weight/2;
	}
	
	 @Override
		public boolean equals(final Object obj) {
	        if (obj == null) { return false; }
	        if (obj == this) { return true; }
	        if (!(obj instanceof Apple)) { return false; }
	        
	        Apple ap = (Apple) obj;
	        
	        if(appleKind == null && ap.appleKind != null) return false;
	        return appleKind.equals(ap.appleKind) && weight == ap.weight;
	    }
	
	@Override
    public int hashCode() {
        return this.weight * 31 + this.appleKind.hashCode(); 
    }
}

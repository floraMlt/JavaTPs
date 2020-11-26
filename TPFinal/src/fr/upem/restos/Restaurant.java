package fr.upem.restos;

import java.util.Objects;

public class Restaurant {
	private static final int DEFAULT_STARS = 0;
	private final String name;
	private final int covers;
	private final int stars;
	
    public Restaurant(String name, int covers, int stars) {
        if(name == null || covers < 0 || stars < 0) {
            throw new IllegalArgumentException("Bad parameter");
        }
        this.name = name;
        this.covers = covers;
        this.stars = stars;
    }
    public Restaurant(String name, int covers) {
        this(name, covers, DEFAULT_STARS);
    }
    
    @Override
    public String toString() {
    	StringBuilder str = new StringBuilder();
    	str.append(name);
        for(int i=0; i<stars; i++) { 
        	str.append("*");
        }
        str.append(" (").append(covers).append(")");
        return str.toString();
    }
    
    @Override
    public boolean equals(Object o) {
    	if(!(o instanceof Restaurant)) {
    		return false;
    	}
        Restaurant r = (Restaurant) o;
        return name == r.name && covers == r.covers && stars == r.stars;
    }
    
    @Override
    public int hashCode(){
    	return Objects.hash(name, covers, stars);
    }
    
   /* public static void main(String[] args) {
        Restaurant r1 = new Restaurant("Le p'tit creux", 25);
        Restaurant r2 = new Restaurant("Le p'tit creux", 25, 0);
        System.out.println(r2);  // affiche "Le p'tit creux (25)"
        Restaurant r3 = new Restaurant("Le Pré Catlan", 50, 3);
        System.out.println(r3);  // affiche "Le Pré Catlan*** (50)"
        System.out.println(r1.equals(r2)); // affiche "true"
        System.out.println(r1.equals(r3)); // affiche "false"
    }*/
}

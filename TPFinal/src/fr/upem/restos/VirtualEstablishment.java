package fr.upem.restos;

import java.util.Objects;

abstract class VirtualEstablishment implements Establishment {
	static final int DEFAULT_STARS = 0;
	final String name;
	final int stars;
	
	
	VirtualEstablishment(String name, int stars) {
		Objects.requireNonNull(name, "Name must not be null");
    	if(stars < 0) throw new IllegalArgumentException("Bad parameter");
        this.name = name;
        this.stars = stars;
    }
    
    abstract String toStringSpe();
    abstract int hashSpe();
   
    public int stars() {
    	return stars;
    }
    
    @Override
    public String toString() {
    	StringBuilder str = new StringBuilder();
    	str.append(this.name);
    	for(int i=0; i<stars; i++) { str.append("*");}
    	str.append(" (");
    	str.append(this.toStringSpe());
    	str.append(")");
    	return str.toString();
    }
    
    @Override
    public boolean equals(Object o) {
    	if(!(o instanceof VirtualEstablishment)) return false;
    	VirtualEstablishment r = (VirtualEstablishment) o;
        return name == r.name && stars == r.stars;
    }
    
    @Override
    public int hashCode() {
    	return Objects.hash(name, stars, this.hashSpe());
    }
}

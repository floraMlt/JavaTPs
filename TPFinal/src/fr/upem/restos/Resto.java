package fr.upem.restos;

import java.util.Objects;
import fr.upem.restos.VirtualEstablishment;

public class Resto extends VirtualEstablishment{
	private final int covers;

    public Resto(String name, int covers, int stars) {
        super(name, stars);
    	if(covers < 0) {
            throw new IllegalArgumentException("Bad parameter");
        }
        this.covers = covers;
    }
    public Resto(String name, int covers) {
        this(name, covers, DEFAULT_STARS);
    }
    
    @Override
    public int stars() {
    	return super.stars();
    }
    
    String toStringSpe() {
        return String.valueOf(covers);
    }
    
    int hashSpe() {
    	return Objects.hash(covers);
    }
    
    @Override
    public boolean equals(Object o) {
    	if(!super.equals(o) || !(o instanceof Resto)) {
    		return false;
    	}
        Resto r = (Resto) o;
        return covers == r.covers;
    }
    
}

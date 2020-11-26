package fr.upem.restos;

import java.util.Objects;
import fr.upem.restos.VirtualEstablishment;

public class Bar extends VirtualEstablishment{
	private final boolean afterEight;
	
	public Bar(String name, boolean afterEight, int stars) {
        super(name, stars);
        this.afterEight = Objects.requireNonNull(afterEight);
    }
	
    public Bar(String name, boolean afterEight) {
        this(name, afterEight, DEFAULT_STARS);
    }
    
    String toStringSpe() {
    	return (afterEight) ? "open after eight" : "not open after eight";
    }
    
    int hashSpe() {
    	return Objects.hash(afterEight);
    }
    
    @Override
    public boolean equals(Object o) {
    	if(!super.equals(o) || !(o instanceof Bar)) return false;
        Bar b = (Bar) o;
        return afterEight == b.afterEight;
    }
	
    @Override
    public int stars() {
    	return super.stars();
    }
}

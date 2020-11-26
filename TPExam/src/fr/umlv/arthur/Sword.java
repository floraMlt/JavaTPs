package fr.umlv.arthur;

import java.util.Objects;

public class Sword extends Equipment implements Weapon{
	// Attributs
	private final int damage;
	
	// Constructeur
	public Sword(String name, int damage) {
		super(name);
		if(damage <= 0) {
			throw new IllegalArgumentException("Le dégat ne peut pas être négatif ou égal à 0");
		} 
		this.damage = damage;
	}
	
	public int damage() {
		return this.damage;
	}
	
	@Override
	public boolean equals(Object obj) {
		Objects.requireNonNull(obj, "L'objet ne peut pas être null");
		if(!(obj instanceof Sword)) {
			return false;
		} 
		Sword sw = (Sword) obj;
		return this.name().equals(sw.name()) 
				&& this.damage == sw.damage;
	}
	
	@Override
	public int hashCode() {
        return this.damage * 31 + this.name().hashCode(); 
    }
	
}

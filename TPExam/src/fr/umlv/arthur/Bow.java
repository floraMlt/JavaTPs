package fr.umlv.arthur;

import java.util.Objects;

public class Bow extends Equipment implements Weapon, ProtectionEquipment {
	// Attributs
	private final int damage;
	private final int protection;
	
	
	// Constructeurs
	public Bow(String name, int damage, int protection) {
		super(name);
		if(damage <= 0) {
			throw new IllegalArgumentException("Le d�gat ne peut pas �tre n�gatif ou �gal � 0");
		} 
		this.damage = damage;
		
		if(protection <= 0) {
			throw new IllegalArgumentException("La protection ne peut pas �tre n�gative ou �gale � 0");
		} 
		this.protection = protection;
	}
	
	// M�thodes
	public int damage() {
		return this.damage;
	}
	
	public int protection() {
		return this.protection;
	}
	
	@Override
	public boolean equals(Object obj) {
		Objects.requireNonNull(obj, "L'objet ne peut pas �tre null");
		if(!(obj instanceof Bow)) {
			return false;
		} 
		Bow bow = (Bow) obj;
		return this.name().equals(bow.name()) 
				&& this.protection == bow.protection
				&& this.damage == bow.damage;
	}
	
	@Override
	public int hashCode() {
        return this.protection * 31 + this.damage * 20 + this.name().hashCode(); 
    }
}

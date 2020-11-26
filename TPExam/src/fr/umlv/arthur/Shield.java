package fr.umlv.arthur;

import java.util.Objects;

public class Shield extends Equipment implements ProtectionEquipment{
	// Attributs
	private final int protection;
	
	// Constructeur
	public Shield(String name, int protection){
		super(name);
		if(protection <= 0) {
			throw new IllegalArgumentException("La protection ne peut pas �tre n�gative ou �gale � 0");
		} 
		this.protection = protection;
	}
	
	// M�thodes
	public int protection() {
		return protection;
	}
	
	@Override
	public boolean equals(Object obj) {
		Objects.requireNonNull(obj, "L'objet ne peut pas �tre null");
		if(!(obj instanceof Shield)) {
			return false;
		} 
		Shield sh = (Shield) obj;
		return this.name().equals(sh.name()) 
				&& this.protection == sh.protection;
	}
	
	@Override
	public int hashCode() {
        return this.protection * 31 + this.name().hashCode(); 
    }
}

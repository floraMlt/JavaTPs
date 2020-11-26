package fr.umlv.arthur;

import java.util.Objects;

public class Heroicity {
	// Attributs
	private final int coeffHeroDamage;
	private final int coeffHeroProtection;
	
	// Constructeurs
	public Heroicity(int coeffHero) {
		this(coeffHero, coeffHero);
	}
	
	public Heroicity(int coeffHeroDamage, int coeffHeroProtection) {
		if(coeffHeroDamage <= 0 && coeffHeroDamage > 3 && coeffHeroProtection <= 0 && coeffHeroProtection > 3) {
			throw new IllegalArgumentException("L'h�roicit� du h�ro doit �tre comprise entre 1 et 3");
		} 
		this.coeffHeroDamage = coeffHeroDamage;
		this.coeffHeroProtection = coeffHeroProtection;
	}
	
	// M�thodes
	boolean isHeroic() {
		return (coeffHeroDamage == 1 && coeffHeroProtection == 1) ? false : true;
	}
	
	int heroDamage(int damage){
		if(damage <= 0) {
			throw new IllegalArgumentException("Le d�gat ne peut pas �tre n�gatif ou �gal � 0");
		} 
		return damage * coeffHeroDamage;
	}
	
	int heroProtection(int protect){
		if(protect < 0) {
			throw new IllegalArgumentException("La protection ne peut pas �tre n�gative");
		} 
		return protect * coeffHeroProtection;
	}
	
	@Override
	public boolean equals(Object obj) {
		Objects.requireNonNull(obj, "L'objet ne peut pas �tre null");
		if(!(obj instanceof Heroicity)) {
			return false;
		} 
		Heroicity hero = (Heroicity) obj;
		return this.coeffHeroDamage == hero.coeffHeroDamage
				&& this.coeffHeroProtection == hero.coeffHeroProtection;
	}
	
	@Override
	public int hashCode() {
        return Objects.hash(coeffHeroDamage, coeffHeroProtection);
    }
}

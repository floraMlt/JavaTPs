package fr.umlv.arthur;
import java.util.List;
import java.util.Objects;

public class Knight {
	// Attributs
	private final String name;
	private final List<Equipment> equipments;
	private Heroicity heroicity = new Heroicity(1);
	
	// Constructeurs
	/*public Knight(String name, Sword sword){
		this(name, sword, null);
	}
	
	public Knight(String name, Sword sword, Sword sword2){
		if(name.length() == 0) {
			throw new IllegalArgumentException("Le nom doit au moins avoir un caractère");
		}
		this.name = Objects.requireNonNull(name, "Le nom ne peut pas être null");
		this.sword = Objects.requireNonNull(sword, "Un chevalier doit avoir une épée, celle-ci est null pour l'instant");
		this.sword2 = sword2;
	}*/
	
	public Knight(String name, Equipment ...equipments) {
		if(name.length() == 0) {
			throw new IllegalArgumentException("Le nom doit au moins avoir un caractère");
		}
		this.name = Objects.requireNonNull(name, "Le nom ne peut pas être null");
		boolean hasWeapon = false;
		Objects.requireNonNull(equipments, "Les armes ne peuvent pas être null");
		for(Equipment e : equipments) {
			if(e instanceof Weapon) {
				hasWeapon = true;
			}
		}
		if(!hasWeapon) {
			throw new IllegalArgumentException("Il faut au moins une arme à ce chevalier !");
		}
		this.equipments = List.<Equipment>of(equipments);
	}
	
	// Méthodes
	/*public int damage() {
		if(sword2 != null) {
			return sword.damage() + sword2.damage();
		} else return sword.damage();
	}*/
	
	public int damage() {
		int nbDamage = 0;
		for(Equipment e : equipments) {
			if(e instanceof Weapon) nbDamage += ((Weapon) e).damage(); 
		} 
		return heroicity.heroDamage(nbDamage);
	}
	
	public int protection() {
		int nbProtection = 0;
		for(Equipment e : equipments) {
			if(e instanceof ProtectionEquipment) nbProtection += ((ProtectionEquipment) e).protection();
		} 
		return heroicity.heroProtection(nbProtection);
	}
	
	public String name() {
		return this.name;
	}
	
	public boolean isBetterThan(Knight knight) {
		Objects.requireNonNull(knight, "L'ennemi ne peut être null ! (jeu de mots avec nul)");
		if(this.damage() > knight.damage()) return true;
		else if (this.damage() == knight.damage()) {
			if(this.protection() > knight.protection()) return true;
		} return false;
	}
	
	public boolean isHeroic(){
		return heroicity.isHeroic();
	}
	
	public void setHeroicity(Heroicity hero) {
		Objects.requireNonNull(hero, "L'héroicité ne doit pas être null");
		this.heroicity = hero;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(this.name);
        str.append(" damage : ").append(this.damage());
        str.append(" protection : ").append(this.protection()).append("\n");
        str.append("  [ ");
        for(Equipment e : equipments) {
            str.append(e).append(", ");
        }
        str.setLength(str.length()-2);
        str.append(" ]");
        return str.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		Objects.requireNonNull(obj, "L'objet ne peut pas être null");
		if(!(obj instanceof Knight)) {
			return false;
		} 
		Knight kn = (Knight) obj;
		return this.name().equals(kn.name()) 
				&& this.damage() == kn.damage()
				&& this.protection() == kn.protection()
				&& this.heroicity.equals(kn.heroicity);
	}
	
	@Override
	public int hashCode() {
        return this.damage() * 31 + this.protection() * 20 + this.name().hashCode(); 
    }
}

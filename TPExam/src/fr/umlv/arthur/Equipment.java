package fr.umlv.arthur;
import java.util.Objects;

public abstract class Equipment {
	// Attributs
	private final String name;
	
	// Constructeur
	Equipment(String name){
		if(name.length() == 0) {
			throw new IllegalArgumentException("Le nom doit au moins avoir un caractère");
		}
		this.name = Objects.requireNonNull(name, "Le nom ne peut pas être null");
	}
	
	// Méthodes
	public String name() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return name();
	}
}

/* J'avais pensé mettre les éléments liés aux damages et protection de chaque équipement dans Equipement, mais dans ce cas là par exemple un bouclier a un attribut damage et je ne trouve pas ça logique. Cela crée de la confusion plus qu'autre chose.
 * Dans ma classe Equipment, je n'ai donc que ce qui est vraiment commun à tous les équipements. */
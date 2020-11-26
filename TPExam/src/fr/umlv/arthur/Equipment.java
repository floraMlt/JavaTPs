package fr.umlv.arthur;
import java.util.Objects;

public abstract class Equipment {
	// Attributs
	private final String name;
	
	// Constructeur
	Equipment(String name){
		if(name.length() == 0) {
			throw new IllegalArgumentException("Le nom doit au moins avoir un caract�re");
		}
		this.name = Objects.requireNonNull(name, "Le nom ne peut pas �tre null");
	}
	
	// M�thodes
	public String name() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return name();
	}
}

/* J'avais pens� mettre les �l�ments li�s aux damages et protection de chaque �quipement dans Equipement, mais dans ce cas l� par exemple un bouclier a un attribut damage et je ne trouve pas �a logique. Cela cr�e de la confusion plus qu'autre chose.
 * Dans ma classe Equipment, je n'ai donc que ce qui est vraiment commun � tous les �quipements. */
package fr.umlv.fight;
import java.util.Random;

public class Fighter extends Robot{
	private Random rand;
	
	public Fighter(String name, int seed) {
		super(name);
		this.rand = new Random(seed);
	}
	
	/*public void fire(Robot r) {
		if(rand.nextBoolean()) {
			r.shot;
		}
	}*/
	
	@Override
	public String toString() {
		return "Fighter " + this.getName();
	}
	
	@Override
	public void fire(Robot robot2) {
		if(rollDice()) {
			super.fire(robot2);
		} else {
			System.out.println( this + "a loup� sa cible !");
		}
	}
	
	@Override
	boolean rollDice(){
		if(rand.nextBoolean()) {
			return true;
		} else {
			return false;
		}
	}
}

/*
Exo2 Q1 :
Un g�n�rateur pseudo al�atoire est un algorithme qui g�n�re une s�quence de nombres ayant certaines propri�t�s du hasard et qui semblent al�atoires.
Une graine est utilis�e par le g�n�rateur de nombres pseudo-al�atoires afin d'avoir toujours la m�me s�quence de nombres en fonction de la graine donn�e.

Exo2 Q3 : 
Il ne faut jamais qu'un champs soit d�clar� avec une visibilit� autre que private ou de package car cela va � l'encontre du principe d'encapsulation. En effet, on pourrait acc�der directement aux attributs, ce qu'on ne veut pas.
 
 Exo2 Q5 :
 Les copier-coller sont � utiliser avec parcimonie, en effet on copie un code bon dans un cas sp�cifique mais qui peut ne pas bien fonctionner dans un autre cas. Ainsi, si on utilise le copier-coller, il faut faire attention � bien revoir tout le fonctionnement de l'�l�ment copi� et modifier ce qui nous parait n�cessaire afin de ne pas g�n�rer d'erreurs ou de comportements inattendus.

Exo2 Q9 : Le sous-typage permet de r�utiliser un code d'un super-type et d'appeler ce code avec un sous-type. Exemple : Une classe fille h�rite des m�thodes et attributs d'une classe m�re
Le polymorphisme est le fait de red�finir une m�thode h�rit�e d'une classe-m�re dans une classe afin qu'elle ait un comportement diff�rent de celui de la classe-m�re.
*/
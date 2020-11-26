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
			System.out.println( this + "a loupé sa cible !");
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
Un générateur pseudo aléatoire est un algorithme qui génère une séquence de nombres ayant certaines propriétés du hasard et qui semblent aléatoires.
Une graine est utilisée par le générateur de nombres pseudo-aléatoires afin d'avoir toujours la même séquence de nombres en fonction de la graine donnée.

Exo2 Q3 : 
Il ne faut jamais qu'un champs soit déclaré avec une visibilité autre que private ou de package car cela va à l'encontre du principe d'encapsulation. En effet, on pourrait accéder directement aux attributs, ce qu'on ne veut pas.
 
 Exo2 Q5 :
 Les copier-coller sont à utiliser avec parcimonie, en effet on copie un code bon dans un cas spécifique mais qui peut ne pas bien fonctionner dans un autre cas. Ainsi, si on utilise le copier-coller, il faut faire attention à bien revoir tout le fonctionnement de l'élément copié et modifier ce qui nous parait nécessaire afin de ne pas générer d'erreurs ou de comportements inattendus.

Exo2 Q9 : Le sous-typage permet de réutiliser un code d'un super-type et d'appeler ce code avec un sous-type. Exemple : Une classe fille hérite des méthodes et attributs d'une classe mère
Le polymorphisme est le fait de redéfinir une méthode héritée d'une classe-mère dans une classe afin qu'elle ait un comportement différent de celui de la classe-mère.
*/
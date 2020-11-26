package fr.umlv.main;
import fr.umlv.data.LinkedLink;

public class Main {

	public static void main(String[] args) {
		/* Exo1 q1
		Link maillon1 = new Link(13, null);
		Link maillon2 = new Link(144, null);
		*/
		// Exo 1 et 2.1, 2.2
		LinkedLink<Object> listeChainee = new LinkedLink<>();
		listeChainee.add(10);
		listeChainee.add(241);
		listeChainee.add(16);
		System.out.println(listeChainee);
		System.out.println("Index 2 : "+listeChainee.get(2));
		
		// Exo 2.3
		LinkedLink<String> lc = new LinkedLink<>();
		lc.add("Hello");
		lc.add("Hola");
		lc.add("Oulala");
		System.out.println(lc);
		
		// Exo 3
		System.out.println(lc.contains("Oulala"));
		System.out.println(lc.contains("Java ou javapa ?"));
		System.out.println(listeChainee.contains(10));
		System.out.println(listeChainee.contains(100));
	}

}

/*
EXO 1 :
Q1) La visibilité doit être en privée (private) pour les attributs et en default (package) pour les méthodes et la classe.

EXO 2 :
Q1) Si l'indice est invalide on lance une exception.
Q4) Il faut faire un cast car les objets dans la liste sont stockés en Object, ce qui exclut la possibilité d'appeler des méthodes d'objets plus précis qu'Object. Par exemple, si on stocke un objet de type Pomme dans la LinkedLink, on ne pourra pas accéder à ses méthodes spécifiques si on ne fait pas de cast. Je pense que les développeurs n'aiment pas trop les casts car les possibilités d'erreurs sur le type d'objet deviennent plus importantes pour différentes raisons. 

EXO 3 :
Q1) L'intérêt d'utiliser un type paramétré est de vérifier des contraintes sur les types des paramètres et d'éviter des erreurs.
Q4) Contains utilise equals et equals est défini avec un Object en argument : equal (Object o).
*/

package fr.umlv.calc.main;

import java.util.Scanner;
import fr.umlv.calc.Expr;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner("- + 2 3 4");
		Expr expr = Expr.parse(scanner);
		
		System.out.println(expr);
		
	    /*OpOrValue expression = new OpOrValue(OpOrValue.OP_ADD,
		        new OpOrValue(2),
		        new OpOrValue(3)
		        );
		    System.out.println(expression.eval());
		    var expr = OpOrValue.parse(new Scanner("- + 2 3 4"));
		    System.out.println(expr.eval());
		    System.out.println(expr);*/
	}

}

/* 
 * Exo1 Q1 : Il est private car on ne veut pas que le user puisse y acc�der et l'utiliser. Seules les m�thodes, ici les constructeurs des feuilles et des branches, de la classe peuvent appeler ce constructeur.
 * 
 * Exo1 Q2 : Manque de v�rification au niveau de l'op�rateur fourni 
 * Quand on veut repr�senter un noeud, soit c'est une feuille, soit une branche (operateur)
 * Si quelqu'un construit un noeud avec un op�rateur pas d�fini, cela va poser probl�me, il faut donc faire une v�rification
 * 
 * Exo1 Q6 : On peut utiliser un iterateur : Iterator<String>. On peut utiliser cet iterator dans avec n'importe quelle collection, notamment une liste ou un scanner.
 * 
 * Exo2 Q2 : On doit la mettre dans la classe Expr pour que toutes les expresions (value et operator) puissent l'utiliser
 * 
 * Exo2 Q4 : Une interface ne peut pas �tre instanci�e, elle est destin�e � �tre impl�ment�e par des classes ici Operator et Value. Expr est une sorte de type commun aux classes Value et Operator qui sont diff�rentes. Une classe abstraite est davantage utilis�e quand les classes ont un lien entre elles et qu'elles peuvent h�riter de la classe abstraite.
 * 
 * Exo2 Q5 : Les deux classes Add et Sub doivent h�riter d'une classe Operator qui elle-m�me impl�mente l'interface Expr ayant les m�thodes communes � Add et Sub qui sont toutes les deux des expressions avec un op�rateur.
 * Dans Operator, les m�thodes getLeft et getRight sont protected pour que les classes filles Add et Sub puissent y acc�der, donc seuls les expressions avce des op�rateurs pourront y acc�der.
 * La m�thode getStrOperator est abstraite et est d�finie dans les classes Add et Sub. 
 */

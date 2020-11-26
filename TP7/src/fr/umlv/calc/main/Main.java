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
 * Exo1 Q1 : Il est private car on ne veut pas que le user puisse y accéder et l'utiliser. Seules les méthodes, ici les constructeurs des feuilles et des branches, de la classe peuvent appeler ce constructeur.
 * 
 * Exo1 Q2 : Manque de vérification au niveau de l'opérateur fourni 
 * Quand on veut représenter un noeud, soit c'est une feuille, soit une branche (operateur)
 * Si quelqu'un construit un noeud avec un opérateur pas défini, cela va poser problème, il faut donc faire une vérification
 * 
 * Exo1 Q6 : On peut utiliser un iterateur : Iterator<String>. On peut utiliser cet iterator dans avec n'importe quelle collection, notamment une liste ou un scanner.
 * 
 * Exo2 Q2 : On doit la mettre dans la classe Expr pour que toutes les expresions (value et operator) puissent l'utiliser
 * 
 * Exo2 Q4 : Une interface ne peut pas être instanciée, elle est destinée à être implémentée par des classes ici Operator et Value. Expr est une sorte de type commun aux classes Value et Operator qui sont différentes. Une classe abstraite est davantage utilisée quand les classes ont un lien entre elles et qu'elles peuvent hériter de la classe abstraite.
 * 
 * Exo2 Q5 : Les deux classes Add et Sub doivent hériter d'une classe Operator qui elle-même implémente l'interface Expr ayant les méthodes communes à Add et Sub qui sont toutes les deux des expressions avec un opérateur.
 * Dans Operator, les méthodes getLeft et getRight sont protected pour que les classes filles Add et Sub puissent y accéder, donc seuls les expressions avce des opérateurs pourront y accéder.
 * La méthode getStrOperator est abstraite et est définie dans les classes Add et Sub. 
 */

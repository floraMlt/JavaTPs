package fr.upem.restos.main;

import java.util.ArrayList;
import java.util.List;
import fr.upem.restos.Restaurant;
import fr.upem.restos.Resto;
import fr.upem.restos.Bar;
import fr.upem.restos.Establishment;
import fr.upem.restos.Ranker;

public class Main {
	
	/*public static void printEstablishmentsWithGivenStarNumber(List<Establishment> list, int number) {
		for(Establishment establishment : list) {
			if(establishment.stars() == number) System.out.println(establishment);
		}
	}*/
 
	public static void printEstablishmentsWithGivenStarNumber(List<Establishment> list, int number) {
		list.stream().filter(e -> e.stars() == number).forEach(e -> System.out.println(e));
	}
 
	 public static void main(String[] args) {
		// Exo1
		/*Restaurant r1 = new Restaurant("Le p'tit creux", 25);
	    Restaurant r2 = new Restaurant("Le p'tit creux", 25, 0);
	    System.out.println(r2);  // affiche "Le p'tit creux (25)"
	    Restaurant r3 = new Restaurant("Le Pré Catlan", 50, 3);
	    System.out.println(r3);  // affiche "Le Pré Catlan*** (50)"
	    System.out.println(r1.equals(r2)); // affiche "true"
	    System.out.println(r1.equals(r3)); // affiche "false"*/
	    
	    // Exo2 Q1
	    Establishment r1 = new Resto("Le p'tit creux", 25);
        Establishment r2 = new Resto("Le p'tit creux", 25, 0);
        System.out.println(r2);  // display "Le p'tit creux (25)"
        Establishment r3 = new Resto("Le Pré Catlan", 50, 3);
        System.out.println(r3);  // display "Le Pré Catlan*** (50)"
        System.out.println(r1.equals(r2)); // display "true"
        System.out.println(r1.equals(r3)); // display "false"
        
        Establishment b1 = new Bar("La soif", false);
        Establishment b2 = new Bar("Jusqu'à l'aube", true, 2);
        System.out.println(b1); // display "La soif (not open after eight)"
        System.out.println(b2); // display "Jusqu'à l'aube** (open after eight)"
        
        System.out.println(r3.stars() - b2.stars()); // display "1"
        
        // Exo2 Q2
		// Create a list to store different establishments
        List<Establishment> list = new ArrayList<Establishment>();
        list.add(r1);
        list.add(r3);
        list.add(b1);
        list.add(b2);
        System.out.println(list.contains(new Bar("La soif", false, 0))); // display "true"
        System.out.println(list.contains(new Bar("La soif", true, 0)));  // display "false"
        System.out.println(list.contains(new Resto("La soif", 10)));     // display "false"
        
        printEstablishmentsWithGivenStarNumber(list, 2);
        // display "Jusqu'à l'aube** (open after eight)"
        printEstablishmentsWithGivenStarNumber(list, 0);
        // display "Le p'tit creux (25)"
        //         "La soif (not open after eight)"
        
        
        // Exo2 Q3
        System.out.println(list);
        list.sort((a,b)-> b.stars() - a.stars());
        System.out.println(list); // display the list sorted by decreasing star numbers
        /// Dans le cas où la soustraction vaut 0, on utilise le compareTo() implémenté par String ///
        
        
        // Exo3 Q1
        Ranker<Establishment> moEtGuillaut = new Ranker<>();

        moEtGuillaut.addEvaluation(r3, 5, "Amazing");
        moEtGuillaut.addEvaluation(r3, 1, "So popular");
        moEtGuillaut.addEvaluation(r3, 2);
        moEtGuillaut.addEvaluation(r3, 3, "Not so bad");
        
        moEtGuillaut.addEvaluation(b1, 4, "Nice and simple");
        moEtGuillaut.addEvaluation(b1, 0, "Crappy");
        
        moEtGuillaut.addEvaluation(b2, 1, "Expensive!");
        moEtGuillaut.addEvaluation(b2, 4, "Fashionable and funny");
        
        // Exo3 Q2
        var average = moEtGuillaut.averageScoreFor(new Resto("Le Pré Catlan", 50, 3));
        System.out.println(average); // display something like 2.75

        moEtGuillaut.printCommentsForItemWithScoreBetterOrEqualsThan(3);
        // display something like:
        //      La soif (not open after eight) : [<4>Nice and simple]
        //		Jusqu'à l'aube** (open after eight) : [<4>Fashionable and funny]
        //		Le Pré Catlan*** (50) : [<5>Amazing, <3>Not so bad]
                
        moEtGuillaut.printCommentsForItemVerifying(e -> e.stars() >= 2);
        // display something like:
        // Jusqu'à l'aube** (open after eight) : [<1>Expensive!, <4>Fashionable and funny]
        // Le Pré Catlan*** (50) : [<5>Amazing, <1>So popular, <2>, <3>Not so bad]
	 }
}

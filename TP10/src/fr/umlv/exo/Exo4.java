package fr.umlv.exo;

import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.function.ToLongBiFunction;
import java.util.stream.Collectors;
import fr.umlv.exo.Exo1;
import fr.umlv.exo.Exo3;

public class Exo4 {
	// M�thodes
	/* MAIN*/
	public static void main(final String[] args) {
		var list2 = new Random(0)
			        .ints(1_000_000, 0, 100)
			        .mapToObj(Integer::toString)
			        .collect(Collectors.toList());
		
		// Exo4_Q2
		String nbSearched = "53";
		printAndTime(list2, nbSearched);
		
	    // Exo4_Q3
		System.out.println(" Count 1 :  ");
		printAndTime(() -> Exo1.count(list2, "33"));
		System.out.println(" Count 2 :  ");
	    printAndTime(() -> Exo1.count2(list2, "33"));
	    System.out.println(" Count 3 :  ");
	    printAndTime(() -> Exo1.count3(list2, "33"));
	    System.out.println(" Count 3 exo3:  ");
	    printAndTime(() -> Exo3.count3(list2, "33"));

	}
	
	/*AUTRES METHODES*/
	// Exo4_Q2
	private static void printAndTime(List<String>li, String nbSearched) {
		Objects.requireNonNull(nbSearched, "Le nombre recherch� ne doit pas �tre null");
		Objects.requireNonNull(li, "La liste ne doit pas �tre null");
		if(li.isEmpty()) { throw new IllegalArgumentException("La liste ne peut pas �tre vide");}
		var start = System.nanoTime();
		Exo1.count(li, nbSearched);
		var end = System.nanoTime();
		System.out.println(" elapsed time (sans interface fonctionnelle) : " + (end - start));
	}
	
	// Exo4_Q3
	private static <T> void printAndTime(Supplier<T> function) {
		var start = System.nanoTime();
		function.get();
		var end = System.nanoTime();
		System.out.println(" elapsed time (avec interface fonctionnelle Supplier) : " + (end - start));
	}
	
	// ou
	private static <T> void printAndTime2(ToLongBiFunction<List<T>,T> function, List<T> list ,T word ) {
		Objects.requireNonNull(word, "L'�l�ment recherch� ne doit pas �tre null");
		Objects.requireNonNull(list, "La liste ne doit pas �tre null");
		if(list.isEmpty()) { throw new IllegalArgumentException("La liste ne peut pas �tre vide");}
		var start = System.nanoTime();
        function.applyAsLong(list, word);
        var end = System.nanoTime();
        System.out.println(" elapsed time (avec interface fonctionnelle ToLongBiFunction) :  " + (end - start));
    }
	
}
/*
 Exo4_Q1
 Random.ints(int size, int min, int max) : g�n�re un nombre (size) de random int entre les deux derniers int en param�tre
 Random.mapToObj(funtion) : renvoie un Stream constitu� des r�sultats de l'application d'une fonction donn�e en param�tre, ici la fonction retourne un objet de type String repr�sentant la valeur de l'int
 .collect(Collectors.toList()) : stocke lse r�sultats dans une liste
 
 List2 est donc unt liste de String avec les valeurs des nombres al�atoires g�n�r�s. 
*/

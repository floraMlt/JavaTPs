package fr.flora.TP;
import java.util.Scanner; 

public class Calculette {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		int value2 = scanner.nextInt();
		System.out.println("Enter 2 integers : ");
		System.out.println(value);
		System.out.println(value2);
		int result = value + value2;
		System.out.println("Result : " + result);

		// 2) 
		//Les variables sont dans value et value2 et sont de type int
		
		// 3)
		// nextInt est une méthode associée à l'objet scanner
		
		// 4) 
		// La ligne permet d'importer la bibliothèque java contenant les définitions de l'objet scanner
	}
}

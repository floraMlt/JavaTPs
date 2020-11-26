package fr.flora.TP;
import java.util.Scanner;

public class Pascal {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	    int sizeTri;

	    System.out.println("Taille du triangle : ");
	    sizeTri = scanner.nextInt();
	    
	    int [][] triangle = new int[sizeTri][];

	    triangle[0] = new int[1];
	    triangle[0][0] = 1;

	    for (int row = 1; row < sizeTri; row++) {

	    // Chaque ligne du triangle est un tableau à une dimension
	    // dont la taille est celle de la ligne précédente + 1:
	    // on construit ces lignes au fur et à mesure que l'on
	    // progresse dans le tableau
	    triangle[row] = new int [triangle [row - 1].length + 1];

	    // Remplissage du tableau:
	    // les deux éléments aux deux extremités des lignes valent 1.
	    // Les autres sont liés par la relation:
	    // triangle[row][j]= triangle[row-1][j-1] + triangle[row-1][j]

	    for (int col = 0; col <= row; col++) {
	    	if ((col == 0) || (col == row)) {
	    		triangle[row][col] = 1;
	        } else {
	            triangle[row][col] = triangle[row - 1][col - 1]
	            		+ triangle[row - 1][col];
	            }

	        }
	    }

	    for (int row = 0; row < sizeTri; row++) {
	        for (int col = 0; col <= row; col++) {
	            System.out.print(triangle[row][col] + " ");
	        }
	        System.out.println();
	     }
	 }
}

// Java va plus vite quand il y a beaucoup de boucle par exemple car il génère un code plus optimisé en assembleur sur les endroit où il y a pas mal de passage

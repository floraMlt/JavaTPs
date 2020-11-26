package fr.flora.TP;
import  java.lang.Integer;

public class Conversion {
	
	public static int[] stringToInt(String[] tabString) {
		int[] tabInt = new int[tabString.length];
		for(int i=0 ; i<tabString.length ; i++) {
			tabInt[i] = Integer.parseInt(tabString[i]);
		}
		return tabInt;
	}
	
	public static int sum(int[] tabInt) {
		int resultSum = 0;
		for(int i=0 ; i<tabInt.length ; i++) {
			resultSum += tabInt[i]; 
		}
		return resultSum;
	}
	
	// 2) Méthode statique : elle appartient à une classe et non à un objet de la classe
	// Elle ne peut accéder qu'aux membres statiques et peut être appelée même quand il n'y a pas d'objet instancié
	
	// 3) Lance une exception
	
	public static void main(String[] args) {
		int[] newTab = new int[3];
		String[] nStr = new String[3];
		nStr[0] = "15";
		nStr[1] = "5";
		nStr[2] = "231";
		newTab = stringToInt(nStr);
		for (int tab : newTab) {
			System.out.println(tab);
		}
		
		int rSum = sum(newTab);
		System.out.println("Result sum : " + rSum);
	}
}

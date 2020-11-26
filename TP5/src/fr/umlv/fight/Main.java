package fr.umlv.fight;

public class Main {

	public static void main(String[] args) {
		Robot D2R2 = new Robot("D2R2");
		Robot data = new Robot("Data");
		Arena arena = new Arena();
		
		// System.out.println(D2R2); 
        // System.out.println(data);
		System.out.println(arena.fight(D2R2, data) + " gagne.");
		
		Fighter john = new Fighter("John", 1);
		Fighter jane = new Fighter("Jane", 2);
		System.out.println(arena.fight(john, jane) + " gagne.");

	}

}

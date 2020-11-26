package fr.umlv.exo1;

public class ClassA {
	int x = 1;

	public int getX() {
		return x;
	}
		  
	static void printX(ClassA a) {
		System.out.println("in A.printX");
		System.out.println("x " + a.x);
		System.out.println("getX() " + a.getX());
	}
		  
	int m(ClassA a) { return 1; }
}

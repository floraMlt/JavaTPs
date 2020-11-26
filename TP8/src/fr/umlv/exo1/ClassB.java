package fr.umlv.exo1;

public class ClassB extends ClassA {
	int x = 2;

	  public int getX() {
	    return x;
	  }
	  
	  static void printX(ClassB b) {
	    System.out.println("in B.printX");
	    System.out.println("x " + b.x);
	    System.out.println("getX() " + b.getX());
	  }
	  
	  int m(ClassB b) { return 2; }
}

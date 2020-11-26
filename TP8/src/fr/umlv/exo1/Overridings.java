package fr.umlv.exo1;

public class Overridings {
	public static void main(String[] args) {
	    //ClassA.printX(new ClassA());     // 1
		//ClassB.printX(new ClassB());   // 2
	    //ClassA.printX(new ClassB());   // 3
	    ClassA a = new ClassB();
	    a.m(a);              // 4
	  }
}

/*
//1 :
	in A.printX
	x 1
	getX() 1

//2 :
	in B.printX
	x 2
	getX() 2
	
//3 : La Classe B a deux champs x, un pour A et un pour B
	in A.printX
	x 1    // ici prend le x du A car il est appelé par celui là
	getX() 2 // ici prend le x du B

//4 :
	N'affiche rien
*/

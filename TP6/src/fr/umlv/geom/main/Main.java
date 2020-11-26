package fr.umlv.geom.main;
import fr.umlv.geom.*;

public class Main {
	public static void main(String[] args) {
		 var point = new Point(1, 2);
	     var circle = new Circle(point, 1);

	     var circle2 = new Circle(point, 2);
	     circle2.translate(1, 1);

	     System.out.println( "Exo1 Question 6 : " + circle + " " + circle2);
	     
	     var p = new Point(1, 2);
	     var c = new Circle(p, 1);
	     var p2 = c.getCenter();
	     p2.translate(1,1);
	     System.out.println(c);
	     
	     if(c.contains(p)) {
	    	 System.out.println("Le point est dans le cercle");
	     } else {
	    	 System.out.println("Le point n'est pas dans le cercle");
	     }
	     
	     var point2 = new Point(1, 2);
	     var circle3 = new Circle(point2, 2);
	     System.out.println("Exo2 Question 4 : " + circle3);
	     var ring = new Ring(point2, 2, 1);
	     System.out.println(ring);
	}
}

/*
Exo1 Q1 :
	Les attributs x et y de Point sont en final, hors la fonction translate utilise et modifie la valeurs de ces attributs.
	Sinon on peut renvoyer un nouveau point une fois le point translat�
	
Exo1 Q2 :
	On doit les mettre en private.
	
Exo1 Q6 :	
	On a : center = (2,3) and ray = 1 center = (2,3) and ray = 2
	Les deux cercles ont �t� modifi�s, ce n'est pas ce qu'on veut...
	En effet, le premier cercle a servi � construire le second.
	Il faut donc faire une copie d�fensive : on cr�e un nouveau point � partir de celui re�u en argument
		this.point = new Point(point.getx(), point.getY());
	
Exo1 Q7 :
	A la mani�re de la question 6, il faudrait retourner un nouveau Point donnant le centre du cercle

Exo1 Q10 :
	"..." signifie que la fonction sera appel�e avec zero � plusieurs arguments, ici Circle

Exo2 Q1 : 
	Il est judicieux de faire de l'h�ritage quand on se rend compte qu'il y a de la recopie de code dans plusieurs objets et que cele pourrait l'�viter et rester logique.
	Ex : Quand on veut sp�cifier une classe.
	
Exo2 Q3 :
	Il faut lancer une exception
Exo ensuite... Q3 :
	L'h�ritage permet d'�viter les redondances, cependant il faut faire attention � bien red�finir les m�thodes h�rit�es pour qu'elles restent juste dans la classe fille. Il faut aussi faire attention � faire des copies d�fensives quand besoin est.
*/
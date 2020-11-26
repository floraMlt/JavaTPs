
public class Egalite {
	public static void main(String[] args) {
		// 1)
		var s = "toto"; 
		// s est de type string
		// Méthode prédéfinie en fonction du type : méthode de la classe string
		System.out.println(s.length());
		
		//2)
	    var s1 = "toto";
	    var s2 = s1;
	    var s3 = new String(s1);
	    System.out.println(s1 == s2); // affiche true
	    System.out.println(s1 == s3); // affiche false
	    // L'opérateur == ne teste pas si le contenu des strings est le même, mais si ce sont les mêmes instances (même adresse). 
	    // Les strings en java sont immutables. Quand le constructeur d'un objet finit son execution, son instance ne peut plus être changée.
	    
	    // 3)
	    var s4 = "toto";
	    var s5 = new String(s4);
	    System.out.println(s4.compareTo(s5));
	    // On utilise compareTo() qui retourne 0 si les deux Strings ont le même contenu
	     
	    // 4)
	    var s6 = "toto";
	    var s7 = "toto";
	    System.out.println(s6 == s7); // affiche true
	    // L'opérateur == compare les références et s6 et s7 pointent vers le même objet String.
	    
	    // 5)
	    // Il est important que java.lang.String ne soit pas mutable :
	    /* - pour assurer la sécurité du code étant donné que les strings sont passés plusieurs fois en paramètre des fonctions
	       - si on modifie un string, on modofoe la taille éventuellemnt, du coups il est déplacé dans la mémoire, mais en java c'est orienté objet
	       et les variables contiennent des références, il n'y a pas de copie en mémoire. Du coups plusieurs éléments peuvent pointer vers le même string. et si un string est "modifié", la variable a une nouvelle référence vers le nouveau string, mais celui d'avant ne sera pas supprimé car d'autres strings pointent vers lui. 
	    */
	    
	    // 6)
	    var s8 = "hello";
	    s8.toUpperCase();
	    System.out.println(s8); // affiche hello
	    // affiche hello  car la méthode toUpperCase() ne modifie pas s8 étant donnée qu'il n'est pas mutable.
	}
}

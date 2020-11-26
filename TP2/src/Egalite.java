
public class Egalite {
	public static void main(String[] args) {
		// 1)
		var s = "toto"; 
		// s est de type string
		// M�thode pr�d�finie en fonction du type : m�thode de la classe string
		System.out.println(s.length());
		
		//2)
	    var s1 = "toto";
	    var s2 = s1;
	    var s3 = new String(s1);
	    System.out.println(s1 == s2); // affiche true
	    System.out.println(s1 == s3); // affiche false
	    // L'op�rateur == ne teste pas si le contenu des strings est le m�me, mais si ce sont les m�mes instances (m�me adresse). 
	    // Les strings en java sont immutables. Quand le constructeur d'un objet finit son execution, son instance ne peut plus �tre chang�e.
	    
	    // 3)
	    var s4 = "toto";
	    var s5 = new String(s4);
	    System.out.println(s4.compareTo(s5));
	    // On utilise compareTo() qui retourne 0 si les deux Strings ont le m�me contenu
	     
	    // 4)
	    var s6 = "toto";
	    var s7 = "toto";
	    System.out.println(s6 == s7); // affiche true
	    // L'op�rateur == compare les r�f�rences et s6 et s7 pointent vers le m�me objet String.
	    
	    // 5)
	    // Il est important que java.lang.String ne soit pas mutable :
	    /* - pour assurer la s�curit� du code �tant donn� que les strings sont pass�s plusieurs fois en param�tre des fonctions
	       - si on modifie un string, on modofoe la taille �ventuellemnt, du coups il est d�plac� dans la m�moire, mais en java c'est orient� objet
	       et les variables contiennent des r�f�rences, il n'y a pas de copie en m�moire. Du coups plusieurs �l�ments peuvent pointer vers le m�me string. et si un string est "modifi�", la variable a une nouvelle r�f�rence vers le nouveau string, mais celui d'avant ne sera pas supprim� car d'autres strings pointent vers lui. 
	    */
	    
	    // 6)
	    var s8 = "hello";
	    s8.toUpperCase();
	    System.out.println(s8); // affiche hello
	    // affiche hello  car la m�thode toUpperCase() ne modifie pas s8 �tant donn�e qu'il n'est pas mutable.
	}
}

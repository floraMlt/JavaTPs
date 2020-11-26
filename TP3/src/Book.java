
public class Book {

	private String title;
	private String author;
	boolean hasTitle;
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	// Q7 Exo1
	/*
	public Book(String ptitle, String pauthor) {
		this.title = ptitle;
		this.author = pauthor;
	}*/
	
	//Q8 Exo1
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.hasTitle = true;
	}
	
	// Q9 Exo1
	public Book(String ptitle) {
		this(ptitle, "<no author>"); // on aurait pu refaire comme dans le premier constructeur mais il y aurait eu des r�p�titions
		this.hasTitle = false;
	}
	
	// Q2 Exo2
	public boolean areBooksEqual(Book book) {
		if ( book == null || this.getClass() != book.getClass()) { 
			System.out.println("Erreur, un des objets n'est pas un livre ou est null");
			return false; 
		} else {
			if((this.title).equals(book.title)&&(this.author).equals(book.author)) { 
				System.out.println("Les livres sont les m�mes");
				return true; 
			} else { 
				System.out.println("Les livres ne sont pas �gaux");
				return false; 
			}
		}
	}
	
	// Q6 et Q7 Exo2
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			Book b=(Book) obj;
			if(this.title.equals(b.getTitle()) && this.author.equals(b.getAuthor())) { return true; }
			else { return false; }
		} else { return false; }
	}
	
	// Q1 Exo3
	@Override
	public String toString() {
		return title + " by " + author;
	}
	
	// Q3 Exo3
	/*@Override
	public String toString() {
		if(this.hasTitle == false) {
			return title;
		}
	}*/
	
}


// Q2 Exo1
/*
 Un objet Book est cr�� avec le constructeur par d�faut. Etant donn� que l'on a pass� aucune valeur pour les attributs, le constructeur par d�faut met � null les attributs.
 */

// Q3 Exo1
/*
 Pour que la classe Main puisse acc�der aux attributs de Book, il faut que ceux-ci soient en public (pas super...) ou alors qu'ils aient des getters/setters (public) pour garder le concept d'encapsulation et que le classe Main puisse y acc�der.
 */

//Q4 Exo1
/*
Les 4 visibilit�s en Java sont : 
- public
- private
- protected
- default

Il faut d�clarer les champs en priv� car cela permet d'�viter des probl�mes de side effect.
En effet, il se peut qu'on change sans le vouloir une valeur d'une variable (en appelant une fonction ou autre) et que cela provoque des erreurs apr�s.
En mettant les attributs en priv�, on �vite que les �l�ments soient accessibles par n'importe quelle classe et on respecte le principe d'encapsulation.
*/

//Q5 Exo1
/*
Un accesseur est une m�thode publique de la classe qui permet � l'utilisateur (ou autre classe) d'un objet d'acc�der � un de ses attributs qui est priv�.
Cela permet de repecter l'encapsulation et de proposer � l'utilisateur une interface afin de manipuler son objet.
Les accesseurs doivent �tre en priv� et utilis�s dans l'objet Book lui-m�me (dans le constructeur, etc.)
Ici, il nous faut un accesseur pour author et un autre pour title.
*/

//Q6 Exo1
/* 
Il faut mettre final aux variables auxquelles il ne faut pas toucher de nouveau.
Cela permet d'�viter d'�ventuels probl�mes rencontr�s plus tard si la variable vient � �tre modifi�e par m�garde. 
*/

//Q7 Exo1
/*
Le code du main ne fonctionne plus car on lui donne un nouveau constructeur. Il faut donc l'adapter et passer des attributs en param�tre. 
*/

//Q8 Exo1
/*
Il faut mettre this pour faire r�f�rence � l'�l�ment courant et que le compilateur ne le confonde pas avec les arguments �tant donn� que les param�tres et les attributs de l'objet ont le m�me nom.
*/

// Q10 Exo1
/*
Il prend un constructeur en fonction des arguments donn�s lors de l'appel du constructeur 
*/

// Q11 Exo1
/*
Le second constructeur appelle le premier gr�ce � this() et donne comme second argument la valeur "<no author>".
*/

/////// EXO2 //////////

//Q1 Exo2
/*
Il affiche la comparaison entre les r�f�rences des instances de Book et pas les attributs String.
*/

// Q3 Exo2
/*
 IndexOf regarde si l'objet pass� en argument est dans la liste, si oui renvoie l'index, si ce n'est pas le cas renvoie -1
*/

//Q4 Exo2
/*
Il y a une erreur li�e au fait que le type des variables/objets mis dans le tableau n'est pas sp�cifi� (var). 
*/

// Q5 Exo2
/*
La m�thode equals est appel�e par ArrayList.indexOf().
*/

// Q8 Exo2
/*
Override permet de d�finir une m�thode qui est h�rit�e de sa classe parente. Avec ce mot cl�, le compilateur comprend qu'on ref�finit une m�thode de la classe parente et v�rifiera qu'elle est correctement utilis�e.
S'il s'av�re qu'il y a une erreur lors de la red�finition d'une m�thode h�rit�e de la classe parente, le compilateur lancera un avertissement au d�veloppeur.
 */

// Q9 Exo2 
/*
Il y a une erreur : nullPointerException. Le probl�me vient du fait que les attributs des Books sont � null. Il faudrait pouvoir �viter de cr�er un Book ayant des attributs � null.
*/

// Q10 Exo2
/*
Il ne faut pas l'utiliser pour initialiser des attributs d'objets
*/

// Q11 Exo2
/*
java.util.Objects.requireNonNull permet de v�rifier que la r�f�rence vers l'objet sp�cifi� n'est pas null. On peut ainsi l'utiliser lors de l'appel des constructeur pour �viter de mettre null � certains attributs.
*/

/////// EXO3 //////////

// Q2 Exo3
/*
Oui on peut utiliser @Override car on red�finit une m�thode de la classe java.lang.Object.
*/

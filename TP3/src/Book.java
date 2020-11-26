
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
		this(ptitle, "<no author>"); // on aurait pu refaire comme dans le premier constructeur mais il y aurait eu des répétitions
		this.hasTitle = false;
	}
	
	// Q2 Exo2
	public boolean areBooksEqual(Book book) {
		if ( book == null || this.getClass() != book.getClass()) { 
			System.out.println("Erreur, un des objets n'est pas un livre ou est null");
			return false; 
		} else {
			if((this.title).equals(book.title)&&(this.author).equals(book.author)) { 
				System.out.println("Les livres sont les mêmes");
				return true; 
			} else { 
				System.out.println("Les livres ne sont pas égaux");
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
 Un objet Book est créé avec le constructeur par défaut. Etant donné que l'on a passé aucune valeur pour les attributs, le constructeur par défaut met à null les attributs.
 */

// Q3 Exo1
/*
 Pour que la classe Main puisse accéder aux attributs de Book, il faut que ceux-ci soient en public (pas super...) ou alors qu'ils aient des getters/setters (public) pour garder le concept d'encapsulation et que le classe Main puisse y accéder.
 */

//Q4 Exo1
/*
Les 4 visibilités en Java sont : 
- public
- private
- protected
- default

Il faut déclarer les champs en privé car cela permet d'éviter des problèmes de side effect.
En effet, il se peut qu'on change sans le vouloir une valeur d'une variable (en appelant une fonction ou autre) et que cela provoque des erreurs après.
En mettant les attributs en privé, on évite que les éléments soient accessibles par n'importe quelle classe et on respecte le principe d'encapsulation.
*/

//Q5 Exo1
/*
Un accesseur est une méthode publique de la classe qui permet à l'utilisateur (ou autre classe) d'un objet d'accéder à un de ses attributs qui est privé.
Cela permet de repecter l'encapsulation et de proposer à l'utilisateur une interface afin de manipuler son objet.
Les accesseurs doivent être en privé et utilisés dans l'objet Book lui-même (dans le constructeur, etc.)
Ici, il nous faut un accesseur pour author et un autre pour title.
*/

//Q6 Exo1
/* 
Il faut mettre final aux variables auxquelles il ne faut pas toucher de nouveau.
Cela permet d'éviter d'éventuels problèmes rencontrés plus tard si la variable vient à être modifiée par mégarde. 
*/

//Q7 Exo1
/*
Le code du main ne fonctionne plus car on lui donne un nouveau constructeur. Il faut donc l'adapter et passer des attributs en paramètre. 
*/

//Q8 Exo1
/*
Il faut mettre this pour faire référence à l'élément courant et que le compilateur ne le confonde pas avec les arguments étant donné que les paramètres et les attributs de l'objet ont le même nom.
*/

// Q10 Exo1
/*
Il prend un constructeur en fonction des arguments donnés lors de l'appel du constructeur 
*/

// Q11 Exo1
/*
Le second constructeur appelle le premier grâce à this() et donne comme second argument la valeur "<no author>".
*/

/////// EXO2 //////////

//Q1 Exo2
/*
Il affiche la comparaison entre les références des instances de Book et pas les attributs String.
*/

// Q3 Exo2
/*
 IndexOf regarde si l'objet passé en argument est dans la liste, si oui renvoie l'index, si ce n'est pas le cas renvoie -1
*/

//Q4 Exo2
/*
Il y a une erreur liée au fait que le type des variables/objets mis dans le tableau n'est pas spécifié (var). 
*/

// Q5 Exo2
/*
La méthode equals est appelée par ArrayList.indexOf().
*/

// Q8 Exo2
/*
Override permet de définir une méthode qui est héritée de sa classe parente. Avec ce mot clé, le compilateur comprend qu'on reféfinit une méthode de la classe parente et vérifiera qu'elle est correctement utilisée.
S'il s'avère qu'il y a une erreur lors de la redéfinition d'une méthode héritée de la classe parente, le compilateur lancera un avertissement au développeur.
 */

// Q9 Exo2 
/*
Il y a une erreur : nullPointerException. Le problème vient du fait que les attributs des Books sont à null. Il faudrait pouvoir éviter de créer un Book ayant des attributs à null.
*/

// Q10 Exo2
/*
Il ne faut pas l'utiliser pour initialiser des attributs d'objets
*/

// Q11 Exo2
/*
java.util.Objects.requireNonNull permet de vérifier que la référence vers l'objet spécifié n'est pas null. On peut ainsi l'utiliser lors de l'appel des constructeur pour éviter de mettre null à certains attributs.
*/

/////// EXO3 //////////

// Q2 Exo3
/*
Oui on peut utiliser @Override car on redéfinit une méthode de la classe java.lang.Object.
*/

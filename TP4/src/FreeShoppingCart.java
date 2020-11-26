import  java.util.ArrayList;
import java.util.Iterator;

public class FreeShoppingCart {
	private ArrayList<Book> listBooks;

	public FreeShoppingCart() {
		super();
		this.listBooks = new ArrayList<Book>();
	}
	
	public void add(Book book) {
		this.listBooks.add(book);
	}
	
	// Exo3 Q2
	public Book longestTitle() {
		int longest = 0;
		Book book = null;
		
		/*for (int i=0 ; i<this.listBooks.size(); i++) {
			if(this.listBooks.get(i).getTitle().length() > longest) {
				longest = this.listBooks.get(i).getTitle().length();
				book = this.listBooks.get(i);
			}
		}*/
	
	
		// Exo3 Q3
		/*Iterator<Book> it = this.listBooks.iterator();
		while(it.hasNext()) {
			Book tmp = it.next();
			if(tmp.getTitle().length() > longest) {
				longest = tmp.getTitle().length();
				book = tmp;
			}
		}*/
		
		// Exo3 Q4
		for(Book tmpBook : this.listBooks) {
			if(tmpBook.getTitle().length() > longest) {
				longest = tmpBook.getTitle().length();
				book = tmpBook;
			}
		}
		return book;
	}
	
	// Exo3 Q5  Complexit� en O(n)
	public void removeFirtOccurence(Book book) {
		Iterator<Book> it = listBooks.iterator();
		while(it.hasNext()) {
			it.remove();
			break;
		}
	}
	
	// Exo3 Q6 
	public void removeFirstOccurence(Book bookToRemove) {
		this.listBooks.remove(bookToRemove);
	}
	
	public static void main(String[] args) {
		var book1 = new Book("Da Java Code", "Duke Brown");
		var book2 = new Book("Da", "Brown");
		//var book3 = new Book("Code", "Dukown");
		var caddie = new FreeShoppingCart();
		caddie.add(book1);
		caddie.add(book2);
		//caddie.add(book3);
		
		System.out.println("Le livre avec le titre le plus long est : " + caddie.longestTitle());
	}
}

// Exo3 Q1 : il faut sp�cifier ArrayList avec <Book>  : ArrayList<Book>
// Exo3 Q4 : A chaque boucle, le compilateur cr�e une instance  de la classe
// Exo3 Q6 : Cela permet d'�viter de faire une boucle, on trouve directement le bon �l�ment avec son index. La complexit� serait en O(1)
// Exo3 Q7 : On utilise un it�rateur quand on ne sait pas o� est l'�l�ment qu'on veut atteindre dans une collection. Foreach quant � lui est utilis� quand on veut chercher/modifier un �l�ment sp�cifique dans chaque �l�ment d'une collection.'
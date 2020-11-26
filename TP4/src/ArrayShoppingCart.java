
public class ArrayShoppingCart {
	private Book[] tabBook;
	private int nbBookMax;
	private int currentNbBook;
	
	// Exo2 Q2
	public ArrayShoppingCart(int nbBookMax) {
		this.nbBookMax = nbBookMax;
		this.tabBook = new Book[nbBookMax];
		this.currentNbBook = -1;
	}
	
	public void add(Book book) {
		if((this.currentNbBook+1) != this.nbBookMax) {
			this.tabBook[this.currentNbBook+1] = book;
			this.currentNbBook = this.currentNbBook+1;
		} else {
			throw new IllegalStateException("Trop de livre");
			//System.out.println("Caddie déjà rempli !");
		}
	}
	
	// Exo2 Q3
	public void display() {
		System.out.println("Nombre de livres : " + (this.currentNbBook+1));
		for (Book b : this.tabBook) 
		{
			System.out.println(b);
		}
		
	}
	
	// Exo2 Q4
	public Book longestTitle() {
		if((currentNbBook+1) != 0) {
			int longest = 0;
			int indexBook = 0;
			for (int i=0 ; i<this.currentNbBook ; i++) {
				if(tabBook[i].getTitle().length() > longest) {
					longest = tabBook[i].getTitle().length();
					indexBook = i;
				}
			}
			return this.tabBook[indexBook];
		} else {return null;}
	}
	
	public static void main(String[] args) {
		var book1 = new Book("Da Java Code", "Duke Brown");
		var book2 = new Book("Da", "Brown");
		//var book3 = new Book("Code", "Dukown");
		var caddie = new ArrayShoppingCart(2);
		caddie.add(book1);
		caddie.add(book2);
		//caddie.add(book3);
		
		caddie.display();
		System.out.println("Le livre avec le titre le plus long est : " + caddie.longestTitle());
	}
}

//// Exo 2 ////
/*
	1) Il n'est pas intéressant de mettre en statique le nombre max de livre car on ne va pas forcément vouloir le même nombre max de livre pour tous les caddies/toutes les instances
 	2)  Nous avons l'erreur : java.lang.ArrayIndexOutOfBoundsException. La méthode add doit d'abord faire un vérification sur le nombre de Books maximal dans le tableau avant d'essayer d'entrer le nouveau Book dans le tableau et créer une erreur.
*/

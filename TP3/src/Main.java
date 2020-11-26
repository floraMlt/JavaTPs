import  java.util.ArrayList;

public class Main {
	public static void main(String[] args) {		
		// Q3 Exo1
		var book = new Book("Tintin", "Herge");
	    System.out.println(book.getTitle() + ' ' + book.getAuthor());
	
	    // Q1 Exo2
	    var b1 = new Book("Da Java Code", "Duke Brown");
	    var b2 = b1;
	    var b3 = new Book("Da Java Code", "Duke Brown");
	    System.out.println(b1 == b2); // true
	    System.out.println(b1 == b3); // false (explications dans Book.java)
	    
	    
	    // Q4 Exo2
	    var list = new ArrayList();
	    list.add(b1);
	    System.out.println(list.indexOf(b2));
	    System.out.println(list.indexOf(b3));
	    
	    // Q9 Exo2
	    /*var aBook = new Book(null, null);
	    var anotherBook = new Book(null, null);
	    var list2 = new ArrayList();
	    list2.add(aBook);
	    System.out.println(list.indexOf(anotherBook));*/
	    
	    var book2 = new Book("Da Java Code", "Dan Duke");
	    System.out.println(book2);
	}
}
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
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.hasTitle = true;
	}
	
	public Book(String ptitle) {
		this(ptitle, "<no author>");
		this.hasTitle = false;
	}
	
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
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			Book b=(Book) obj;
			if(this.title.equals(b.getTitle()) && this.author.equals(b.getAuthor())) { return true; }
			else { return false; }
		} else { return false; }
	}
	
	@Override
	public String toString() {
		return title + " by " + author;
	}
	
}
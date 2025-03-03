public class Book {
	
	private String title;
    private String isbn;
    private Author author;
    
	public Book(String title, String isbn, Author author){
		this.title = title;
		this.isbn = isbn;
		this.author = author;
	}

	String getName(){
		return title;
	}

	String getIsbn(){
		return isbn;
	}

	Author getAuthor(){
		return author;
	}

	void printBook(){

            System.out.println(" Title: " +title);
            System.out.println(" ISBN: " + isbn);
            System.out.println(" Author: " + author.getName());
            System.out.println(" Biography: " + author.getDescription());
            System.out.println("--------------------------------------------");
	}
	
}
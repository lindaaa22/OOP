import java.util.*;

public class Library{
    private List <Book> available = new ArrayList<>();

    void addBook(Book book){
        available.add(book);
        System.out.println("Book added to libarary : " + book.getName());
    }

    void borrowBook(Borrower borrower, Book book){
        available.remove(book);
        borrower.borrowed.add(book);
        System.out.println(borrower.getName() + " borrowed: " + book.getName());
    }
    
    void returnBook(Borrower borrower, Book book){
        borrower.borrowed.remove(book);
        available.add(book);
        System.out.println(borrower.getName() + " returned: " + book.getName());
    }

    void displayLibraryBooks(){
        System.out.println("Books in Library:");
        for(Book book : available){
            book.printBook();
        }
    }
}
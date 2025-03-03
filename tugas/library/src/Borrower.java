import java.util.*;
public class Borrower {
    private String name;
    private  List<Book> borrowed = new ArrayList<>();

    public Borrower(String name){
        this.name = name;
    }

    void displayBorrowedBooks() {
        System.out.println(name+" borrowed : ");
        for (Book book : borrowed) {
           book.print();
        }
    }
    
}
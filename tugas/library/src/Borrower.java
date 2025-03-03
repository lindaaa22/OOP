import java.util.*;
public class Borrower {
    private String name;
    List <Book> borrowed = new ArrayList<>();

    public Borrower(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void displayBorrowedBooks() {
        System.out.println(name+" borrowed : ");
        for (Book book : borrowed) {
           book.printBook();
        }
    }
    
}
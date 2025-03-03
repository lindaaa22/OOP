class Library {
    public ArrayList<Book> book = new ArrayList<>();
    private Map<Borrower, List<Book>> borrowRecord = new HashMap<>();

    void addBook(Book newBook) {
        book.add(newBook);
        System.out.println("Book added to library: "+newBook.title);
        System.out.println("=========================================");
    }

    void borrowBook(Borrower borrower, Book book1) {
        borrowRecord.putIfAbsent(borrower, new ArrayList<>());
        borrowRecord.get(borrower).add(book1);
        borrower.borrowBook(book1);
        System.out.println(borrower.name+" borrow: "+book1.title);
        System.out.println("=========================================");
    }

    void returnBook(Borrower borrower, Book book1) {
        List<Book> book = borrowRecord.get(borrower);
        if(borrower.removeBook(book1) == 1)
            System.out.println(borrower.name+" returned: "+book1.title);
        else 
            System.out.println(borrower.name+" not borrow this book");
        
    }

    void displayLibraryBooks() {
        System.out.println("");
        System.out.println("### Display Library Books ###");
        for(Book books : book) {
            System.out.println("Title: "+books.title);
            System.out.println("ISBN: "+books.isbn);
            System.out.println("Author: "+books.author.name);
            System.out.println("Title: "+books.author.biography);
            System.out.println("=========================================");
        }
    }
}
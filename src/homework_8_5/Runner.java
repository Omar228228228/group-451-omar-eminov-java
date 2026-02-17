package homework_8_5;

public class Runner {
    public static void main(String[] args) {
        Book b1 = new Book("Basis", "Ivanov", 2010);
        Book b2 = new Book("skibidy history", "Petrov", 2015);
        Library lib = new Library();
        lib.books.add(b1);
        lib.books.add(b2);
        Reader r = new Reader("Alex", "12345");
        lib.giveBookToReader(r, "jhgvfc");
        r.showBorrowedBooks();
        lib.receiveBookFromReader(r, "hgfdxfgh");
        r.showBorrowedBooks();
    }
}

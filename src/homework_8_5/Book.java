package homework_8_5;

import java.util.ArrayList;
import java.util.Date;

public class Book {
    String title;
    String author;
    int year;
    boolean isAvailable = true;
    Date borrowDate;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
}

class Reader {
    String fullName;
    String readerTicketNumber;
    ArrayList<Book> borrowedBooks = new ArrayList<>();

    Reader(String fullName, String readerTicketNumber) {
        this.fullName = fullName;
        this.readerTicketNumber = readerTicketNumber;
    }

    void borrowBook(Book b) {
        if (b.isAvailable) {
            b.isAvailable = false;
            b.borrowDate = new Date();
            borrowedBooks.add(b);
        }
    }

    void returnBook(Book b) {
        long diff = new Date().getTime() - b.borrowDate.getTime();
        long days = diff / (1000 * 60 * 60 * 24);
        if (days > 30) {
            System.out.println((days - 30) * 5);
        }
        b.isAvailable = true;
        borrowedBooks.remove(b);
    }

    void showBorrowedBooks() {
        for (Book b : borrowedBooks) {
            System.out.println(b.title);
        }
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b.title.equals(title)) {
                return b;
            }
        }
        return null;
    }

    void giveBookToReader(Reader r, String title) {
        Book b = findBookByTitle(title);
        if (b != null) {
            r.borrowBook(b);
        }
    }

    void receiveBookFromReader(Reader r, String title) {
        Book b = findBookByTitle(title);
        if (b != null) {
            r.returnBook(b);
        }
    }
}


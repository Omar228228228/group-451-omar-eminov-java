package homework_4;
public class Book {

    String title;
    String author;
    int year;
    int pages;

    public Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public void printInfo() {
        System.out.println(title + " — " + author + " (" + year + "), " + pages + " стр.");
    }

    public boolean isThick() {
        return pages > 400;
    }
}
package classwork27;

public class Book {
    private String title;
    private String author;
    private int pages;
    private boolean isRead;

    public Book(String title, String author, int pages, boolean isRead) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isRead = isRead;
    }

    public void markAsRead() {
        this.isRead = true;
    }

    public String getSummary() {
        return title + " — " + author + ", " + pages + " страниц";
    }

    @Override
    public String toString() {
        return getSummary();
    }

    public double readingTimeEstimate() {
        return (double) pages / 40;
    }

    public int getPages() {
        return pages;
    }

}
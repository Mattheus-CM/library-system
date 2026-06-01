package domain;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private String edition;
    private String publisher;
    private boolean available;

    public Book(String title, String author, String edition, String publisher, String isbn) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.publisher = publisher;
        this.available = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getEdition() {
        return edition;
    }

    public String getPublisher() {
        return publisher;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "Book: " + title + " - " + author + " - " + edition + " - " + publisher + " - "
                + isbn + " - " + (available ?  "Available" : "Unavailable");

    }
}
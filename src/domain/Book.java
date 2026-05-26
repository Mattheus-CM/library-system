package domain;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private String edition;
    private String publisher;
    private int totalCopies;
    private int availableCopies;

    public Book(String isbn, String title, String author, String edition, String publisher, int totalCopies) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.publisher = publisher;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }

    public void borrowCopy() {
        if (availableCopies == 0){
            System.out.println("No copies available");
            return;
        }
        this.availableCopies--;
    }

    public void returnCopy(){
        this.availableCopies++;
    }

    public void print() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Edition: " + edition);
        System.out.println("Publisher: " + publisher);
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

    public int getTotalCopies() {
        return totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }
}
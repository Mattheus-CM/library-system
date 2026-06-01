package dao;

import domain.Book;

public class BookDAO {
    private Book[] books;
    private int totalBooks;

    public BookDAO() {
        this.books = new Book[100];
        this.totalBooks = 0;
    }

    public boolean save(Book book) {
        if (this.totalBooks >= this.books.length) return false;
        this.books[this.totalBooks] = book;
        this.totalBooks++;
        return true;
    }

    public Book[] getBooks() {
        return this.books;
    }

    public int getTotalBooks() {
        return this.totalBooks;
    }
}

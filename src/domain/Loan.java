package domain;

public class Loan {
    private int id;
    private String loanDate;
    private String dueDate;
    private String returnDate;
    private Book book;
    private User user;

    public Loan(int id, String loanDate, String dueDate, Book book, User user) {
        this.id = id;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.book = book;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Loan: " + loanDate + " - " + dueDate + " - " + returnDate + " - " + book.getTitle()
                + " - " + user.getName();
    }
}

package domain;

public class Loan {
    private int id;
    private String loanDate;
    private String dueDate;
    private String returnDate;
    private String status; // active, returned, overdue
    private Book book;
    private User user;

    public Loan(int id, String loanDate, String dueDate, Book book, User user) {
        this.id = id;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.status = "ACTIVE";
        this.book = book;
        this.user = user;
        this.book.borrowCopy();
    }

    public void returnBook(String returnDate) {
        this.returnDate = returnDate;
        this.status = "RETURNED";
        this.book.returnCopy();
    }

    public boolean isOverdue(String todayDate) {
        if (todayDate.compareTo(dueDate) > 0) {
            this.status = "OVERDUE";
            return true;
        }
        return false;
    }

    public void print() {
        System.out.println("--- Loan ---");
        System.out.println("ID: " + id);
        System.out.println("Date: " + loanDate);
        System.out.println("Status: " + status);
        System.out.println();
        System.out.println("Book: ");
        book.print();
        System.out.println();
        System.out.println("User: ");
        user.print();
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

    public String getStatus() {
        return status;
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }
}

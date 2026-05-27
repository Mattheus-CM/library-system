import domain.Book;
import domain.Loan;
import domain.User;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch",
                "3rd", "Addison-Wesley", 5);
        Book book2 = new Book("978-0439708184", "Harry Potter and the Sorcerer's Stone",
                "J.K. Rowling", "1st", "Scholastic", 8);
        Book book3 = new Book("978-1491950357", "Designing Data-Intensive Applications",
                "Martin Kleppmann", "2nd", "O'Reilly Media", 3);

        User user1 = new User(1, "Mattheus Martins", "mattheus_cmartins@hotmail.com");

        Loan loan1 = new Loan(1, "26/05/2026", "02/06/2026", book1, user1);

        loan1.print();
    }
}
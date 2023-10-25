package OOP;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean borrowed;
    private Borrower borrower;
    private String borrowDate;

    // Constructor
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.borrowed = false;
        this.borrower = null;
        this.borrowDate = "";
    }

    // Getter methods
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Setter methods
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    // borrowBook method
    public void borrowBook(Borrower b, String date) {
        this.borrowed = true;
        this.borrower = b;
        this.borrowDate = date;
    }

    public void returnBook() {
        this.borrowed = false;
        this.borrower = null;
        this.borrowDate = "";
    }

    // toString method
    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", borrowed=" + borrowed
                + ", borrower=" + borrower + ", borrowDate=" + borrowDate + "]";
    }

    // Main method to test the class
    public static void main(String[] args) {
        Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald");
        Borrower borrower1 = new Borrower(1, "John Doe", "123 Elm Street", "123-456-7890");

        System.out.println(book1);

        book1.borrowBook(borrower1, "25/10/2023");
        System.out.println("\nAfter borrowing:");
        System.out.println(book1);

        book1.returnBook();
        System.out.println("\nAfter returning:");
        System.out.println(book1);
    }
}



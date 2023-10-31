package OOP;

import java.util.ArrayList;
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
        ArrayList<Book> bookList = new ArrayList<>(); // Creating an ArrayList of Book objects

        Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book(2, "To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book(3, "1984", "George Orwell");

        // Adding books to the ArrayList using addBook function
        addBook(bookList, book1);
        addBook(bookList, book2);
        addBook(bookList, book3);

        Borrower borrower1 = new Borrower(1, "John Doe", "123 Elm Street", "123-456-7890");

        // Borrowing a book
        book1.borrowBook(borrower1, "25/10/2023");

        // Printing all books in the ArrayList
        System.out.println("Books in the list:");
        printBooks(bookList);

        // Printing the number of books in the list
        System.out.println("\nNumber of books in the list: " + numberOfBooks(bookList));

        // Checking if a book is in the list
        System.out.println("\nIs '1984' in the list? " + isBookInList(bookList, book3));

        // Returning a book
        book1.returnBook();

        // Removing a book from the ArrayList using removeBook function
        removeBook(bookList, book3);

        // Printing all books in the ArrayList after returning and removing
        System.out.println("\nBooks in the list after returning and removing:");
        printBooks(bookList);
    }

    public static void printBooks(ArrayList<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
    public static void addBook(ArrayList<Book> bookList, Book b) {
        bookList.add(b);
    }
    public static int numberOfBooks(ArrayList<Book> bookList) {
        return bookList.size();
    }
    public static void removeBook(ArrayList<Book> bookList, Book b) {
        bookList.remove(b);
    }
    public static boolean isBookInList(ArrayList<Book> bookList, Book b) {
        return bookList.contains(b);
    }
}



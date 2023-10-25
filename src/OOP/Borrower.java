package OOP;

public class Borrower {
    private int borrowerID;
    private String borrowerName;
    private String borrowerAddress;
    private String borrowerMobile;

    // Constructor
    public Borrower(int borrowerID, String borrowerName, String borrowerAddress, String borrowerMobile) {
        this.borrowerID = borrowerID;
        this.borrowerName = borrowerName;
        this.borrowerAddress = borrowerAddress;
        this.borrowerMobile = borrowerMobile;
    }

    // Getter methods
    public int getBorrowerID() {
        return borrowerID;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public String getBorrowerAddress() {
        return borrowerAddress;
    }

    public String getBorrowerMobile() {
        return borrowerMobile;
    }

    // Setter methods
    public void setBorrowerID(int borrowerID) {
        this.borrowerID = borrowerID;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public void setBorrowerAddress(String borrowerAddress) {
        this.borrowerAddress = borrowerAddress;
    }

    public void setBorrowerMobile(String borrowerMobile) {
        this.borrowerMobile = borrowerMobile;
    }

    // toString method
    @Override
    public String toString() {
        return "Borrower [borrowerID=" + borrowerID + ", borrowerName=" + borrowerName + ", borrowerAddress=" + borrowerAddress
                + ", borrowerMobile=" + borrowerMobile + "]";
    }

    // Main method to test the class
    public static void main(String[] args) {
        Borrower borrower1 = new Borrower(1, "John Doe", "123 Elm Street", "123-456-7890");
        Borrower borrower2 = new Borrower(2, "Jane Smith", "456 Oak Avenue", "987-654-3210");

        System.out.println(borrower1);
        System.out.println(borrower2);
    }
}


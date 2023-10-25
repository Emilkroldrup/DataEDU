package OOP;

public class Student {
    private int studentNr;
    private String firstName;
    private String lastName;
    private String address;
    private String mobile;

    // Constructor
    public Student(int studentNr, String firstName, String lastName, String address, String mobile) {
        this.studentNr = studentNr;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mobile = mobile;
    }

    // Getter methods
    public int getStudentNr() {
        return studentNr;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    // Setter methods
    public void setStudentNr(int studentNr) {
        this.studentNr = studentNr;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    // toString method
    @Override
    public String toString() {
        return "Student [studentNr=" + studentNr + ", firstName=" + firstName + ", lastName=" + lastName
                + ", address=" + address + ", mobile=" + mobile + "]";
    }

    // Main method to test the class
    public static void main(String[] args) {
        Student student1 = new Student(1, "John", "Doe", "123 Elm Street", "123-456-7890");
        Student student2 = new Student(2, "Jane", "Smith", "456 Oak Avenue", "987-654-3210");

        System.out.println(student1);
        System.out.println(student2);
    }
}


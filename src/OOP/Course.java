package OOP;

import java.util.*;

public class Course {
    private int courseNr;
    private String courseName;
    private int numberOfEcts;
    private String dayOfWeek;
    private String time;
    private Student[] participants;
    private int numberOfParticipants;

    // Constructor
    public Course(int courseNr, String courseName, int numberOfEcts, String dayOfWeek, String time) {
        this.courseNr = courseNr;
        this.courseName = courseName;
        this.numberOfEcts = numberOfEcts;
        this.dayOfWeek = dayOfWeek;
        this.time = time;
        this.numberOfParticipants = 0;
        this.participants = new Student[40];
    }

    // Getter methods
    public int getCourseNr() {
        return courseNr;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumberOfEcts() {
        return numberOfEcts;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public String getTime() {
        return time;
    }

    // Setter methods
    public void setCourseNr(int courseNr) {
        this.courseNr = courseNr;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setNumberOfEcts(int numberOfEcts) {
        this.numberOfEcts = numberOfEcts;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Student[] getParticipants() {
        return participants;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setParticipants(Student[] participants) {
        this.participants = participants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public void addStudent(Student name) {
        if (numberOfParticipants < participants.length) {
            participants[numberOfParticipants] = name;
            numberOfParticipants++;
        } else {
            System.out.println("The course is full. Cannot add more participants.");
        }
    }

    public static void printCourse(Course k) {
        System.out.println(k);
        System.out.println("Participants:");
        for (int i = 0; i < k.getNumberOfParticipants(); i++) {
            System.out.println(k.getParticipants()[i]);
        }
    }

    public void unenroll(Student s) {
        for (int i = 0; i < numberOfParticipants; i++) {
            if (participants[i].equals(s)) {
                // Shift the array to remove the student
                for (int j = i; j < numberOfParticipants - 1; j++) {
                    participants[j] = participants[j + 1];
                }
                participants[numberOfParticipants - 1] = null;
                numberOfParticipants--;
                return;
            }
        }
        System.out.println("Student not found in the course.");
    }


    // toString method
    @Override
    public String toString() {
        return "Course [courseNr=" + courseNr + ", courseName=" + courseName + ", numberOfEcts=" + numberOfEcts
                + ", dayOfWeek=" + dayOfWeek + ", time=" + time + "]";
    }

    // Main method to test the class
    public static void main(String[] args) {
        Course course1 = new Course(101, "Mathematics", 5, "Monday", "10-12");
        Course course2 = new Course(102, "Physics", 6, "Wednesday", "14-16");

        Student student1 = new Student(1, "John", "Doe", "123 Elm Street", "123-456-7890");
        Student student2 = new Student(2, "Jane", "Smith", "456 Oak Avenue", "987-654-3210");


        course1.addStudent(student1);
        course1.addStudent(student2);

        course2.addStudent(student2);

        System.out.println("Before unenrolling:");
        printCourse(course1);
        System.out.println();


        course1.unenroll(student2);

        System.out.println("After unenrolling Jane Smith:");
        printCourse(course1);
    }
}


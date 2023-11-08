package Studie;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        ArrayList<Laerer> teachers = fileHandler.readTeachersFromFile();
        ArrayList<Studerende> students = fileHandler.readStudentsFromFile();
        ArrayList<Fag> subjects = fileHandler.readSubjectsFromFile(teachers);
        Skole skole = new Skole();
        skole.setStuderendeListe(students);
        skole.setLaererListe(teachers);
        skole.setFagListe(subjects);
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        int stdnr, laererNr, fagnr;
        String fnavn, enavn, adresse, postnr, mobil, fagNavn;
        char klasse;
        Studerende student;
        Laerer teacher;
        Fag subject;

        while (running) {
            System.out.println("Welcome to the Study Administration System");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Add Subject");
            System.out.println("4. Enroll Student in Subject");
            System.out.println("5. Assign Teacher to Subject");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.println("Enter student number:");
                    stdnr = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter first name:");
                    fnavn = scanner.nextLine();
                    System.out.println("Enter last name:");
                    enavn = scanner.nextLine();
                    System.out.println("Enter address:");
                    adresse = scanner.nextLine();
                    System.out.println("Enter postal code:");
                    postnr = scanner.nextLine();
                    System.out.println("Enter mobile number:");
                    mobil = scanner.nextLine();
                    System.out.println("Enter class:");
                    klasse = scanner.nextLine().charAt(0);
                    student = new Studerende(stdnr, fnavn, enavn, adresse, postnr, mobil, klasse, new ArrayList<>());
                    skole.addStuderende(student);
                    fileHandler.writeToStudentsFile(skole.getStuderendeListe());
                    break;
                case 2:
                    System.out.println("Enter teacher number:");
                    laererNr = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter first name:");
                    fnavn = scanner.nextLine();
                    System.out.println("Enter last name:");
                    enavn = scanner.nextLine();
                    System.out.println("Enter address:");
                    adresse = scanner.nextLine();
                    System.out.println("Enter postal code:");
                    postnr = scanner.nextLine();
                    System.out.println("Enter mobile number:");
                    mobil = scanner.nextLine();
                    teacher = new Laerer(laererNr, fnavn, enavn, adresse, postnr, mobil, new ArrayList<>());
                    skole.addLaerer(teacher);
                    fileHandler.writeToTeachersFile(skole.getLaererListe());
                    break;
                case 3:
                    System.out.println("Enter subject number:");
                    fagnr = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter subject name:");
                    fagNavn = scanner.nextLine();
                    subject = new Fag(fagnr, fagNavn, null, new ArrayList<>());
                    skole.addFag(subject);
                    fileHandler.writeToSubjectsFile(skole.getFagListe());
                    break;
                case 4:
                    System.out.println("Enter student number:");
                    stdnr = scanner.nextInt();
                    System.out.println("Enter subject number:");
                    fagnr = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    student = skole.getStuderende(stdnr);
                    subject = skole.getFag(fagnr);
                    if (student != null && subject != null) {
                        skole.enrollStuderendeToFag(stdnr, fagnr);
                        // Assuming you want to update the files after enrollment as well
                        fileHandler.writeToStudentsFile(skole.getStuderendeListe());
                        fileHandler.writeToSubjectsFile(skole.getFagListe());
                    } else {
                        System.out.println("Student or subject not found.");
                    }
                    break;
                case 5:
                    System.out.println("Enter teacher number:");
                    laererNr = scanner.nextInt();
                    System.out.println("Enter subject number:");
                    fagnr = scanner.nextInt();
                    scanner.nextLine();
                    teacher = skole.getLaerer(laererNr);
                    subject = skole.getFag(fagnr);
                    if (teacher != null && subject != null) {
                        skole.assignLaererToFag(laererNr, fagnr);
                        // Assuming you want to update the files after assignment as well
                        fileHandler.writeToTeachersFile(skole.getLaererListe());
                        fileHandler.writeToSubjectsFile(skole.getFagListe());
                    } else {
                        System.out.println("Teacher or subject not found.");
                    }
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }
}

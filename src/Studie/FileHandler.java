package Studie;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {

    private static final String STUDENT_FILE_PATH = "C:/Users/EmilK/Documents/GitHub/DataEDU/src/Studie/students.txt";
    private static final String TEACHER_FILE_PATH = "src/Studie/teachers.txt";
    private static final String SUBJECT_FILE_PATH = "src/Studie/subjects.txt";

    public void writeToStudentsFile(ArrayList<Studerende> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(STUDENT_FILE_PATH))) {
            for (Studerende student : students) {
                String studentData = String.format("%d,%s,%s,%s,%s,%s,%c",
                        student.getStdnr(),
                        student.getFnavn(),
                        student.getEnavn(),
                        student.getAdresse(),
                        student.getPostnr(),
                        student.getMobil(),
                        student.getKlasse());
                writer.write(studentData);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToTeachersFile(ArrayList<Laerer> teachers) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TEACHER_FILE_PATH))) {
            for (Laerer teacher : teachers) {
                String teacherData = String.format("%d,%s,%s,%s,%s,%s",
                        teacher.getLaererNr(),
                        teacher.getFnavn(),
                        teacher.getEnavn(),
                        teacher.getAdresse(),
                        teacher.getPostnr(),
                        teacher.getMobil());
                writer.write(teacherData);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToSubjectsFile(ArrayList<Fag> subjects) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(SUBJECT_FILE_PATH))) {
            for (Fag subject : subjects) {
                String subjectData = String.format("%d,%s,%s",
                        subject.getFagnr(),
                        subject.getFagNavn(),
                        subject.getLaerer() != null ? Integer.toString(subject.getLaerer().getLaererNr()) : "");
                writer.write(subjectData);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Studerende> readStudentsFromFile() {
        ArrayList<Studerende> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(STUDENT_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty() || line.split(",").length < 7) {
                    continue;
                }
                String[] data = line.split(",");
                try {
                    Studerende student = new Studerende(
                            Integer.parseInt(data[0].trim()),
                            data[1].trim(),
                            data[2].trim(),
                            data[3].trim(),
                            data[4].trim(),
                            data[5].trim(),
                            data[6].trim().charAt(0),
                            new ArrayList<>()
                    );
                    students.add(student);
                } catch (NumberFormatException e) {
                    System.out.println("Skipping line due to NumberFormatException: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    public ArrayList<Laerer> readTeachersFromFile() {
        ArrayList<Laerer> teachers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(TEACHER_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty() || line.split(",").length < 6) {
                    continue;
                }
                String[] data = line.split(",");
                try {
                    Laerer teacher = new Laerer(
                            Integer.parseInt(data[0].trim()),
                            data[1].trim(),
                            data[2].trim(),
                            data[3].trim(),
                            data[4].trim(),
                            data[5].trim(),
                            new ArrayList<>()
                    );
                    teachers.add(teacher);
                } catch (NumberFormatException e) {
                    System.out.println("Skipping line due to NumberFormatException: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teachers;
    }

    public ArrayList<Fag> readSubjectsFromFile(ArrayList<Laerer> teachers) {
        ArrayList<Fag> subjects = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(SUBJECT_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty() || line.split(",").length < 3) {
                    continue;
                }
                String[] data = line.split(",");
                try {
                    int laererNr = !data[2].isEmpty() ? Integer.parseInt(data[2].trim()) : -1;
                    Laerer teacher = teachers.stream()
                            .filter(t -> t.getLaererNr() == laererNr)
                            .findFirst()
                            .orElse(null);
                    Fag subject = new Fag(
                            Integer.parseInt(data[0].trim()),
                            data[1].trim(),
                            teacher,
                            new ArrayList<>()
                    );
                    subjects.add(subject);
                } catch (NumberFormatException e) {
                    System.out.println("Skipping line due to NumberFormatException: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return subjects;
    }
}


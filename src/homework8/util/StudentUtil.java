package homework8.util;

import homework8.domain.Student;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import static homework8.data.Names.*;

public class StudentUtil {

    public static String generateStudentName(String[] names, String[] surnames, String[] middlenames) {
        int nameNumber = new Random().nextInt(names.length);
        int surnameNumber = new Random().nextInt(surnames.length);
        int middlenamesNumber = new Random().nextInt(middlenames.length);
        return (names[nameNumber] + " " + middlenames[middlenamesNumber] + " " + surnames[surnameNumber]);
    }

    public static Student generateStudent(int studentId) {
        return new Student(studentId, generateStudentName(NAMES, SURNAMES, MIDDLENAMES));
    }

    public static Set<Student> generateStudents(int studentsCount) {
        Set<Student> students = new TreeSet<>();

        for (int i = 0; i < studentsCount; i++) {
            students.add(generateStudent(i + 1));
        }
        return students;
    }

    public static void printStudents(Set<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void removeOddStudents(Set<Student> students) {
        students.removeIf(student -> student.getStudentId() % 2 != 0);
        System.out.println("\n*** Odd students was deleted ***");
    }

}//end of class

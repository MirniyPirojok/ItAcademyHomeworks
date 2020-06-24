package homework8and9;

import homework8and9.domain.Student;

import java.util.Set;

import static homework8and9.util.StudentUtil.generateStudents;
import static homework8and9.util.StudentUtil.printStudents;
import static homework8and9.util.StudentUtil.removeOddStudents;

public class StudentDemo {

    private static final int STUDENTS_COUNT = 20;

    public static void main(String[] args) {

        //task4
        /*Создать экземпляр класса TreeSet, поместить в него объекты класса Student (надо его спроектировать).
Вывести на экран информацию о каждом чётном в списке студенте,
 каждого нечётного студента удалить из коллекции.*/

        Set<Student> students = generateStudents(STUDENTS_COUNT);
        printStudents(students);

        removeOddStudents(students);
        System.out.println("Even students:");
        printStudents(students);

    }//end of main
}//end of class

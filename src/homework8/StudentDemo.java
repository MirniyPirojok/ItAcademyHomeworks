package homework8;

import homework8.domain.Student;

import java.util.Set;

import static homework8.util.StudentUtil.*;

public class StudentDemo {
    public static void main(String[] args) {

        //task4
        /*Создать экземпляр класса TreeSet, поместить в него объекты класса Student (надо его спроектировать).
Вывести на экран информацию о каждом чётном в списке студенте,
 каждого нечётного студента удалить из коллекции.*/

        Set<Student> students = generateStudents(20);
        printStudents(students);

        removeOddStudents(students);
        System.out.println("Even students:");
        printStudents(students);

    }//end of main
}//end of class

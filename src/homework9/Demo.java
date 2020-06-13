/*1. Создать экземпляр класса LinkedList, разместить в нём 20 объектов класса Book.
Вывести информацию о всех книгах. Программно удалить из коллекции 7-ю книгу,
 вывести на экран информацию об оставшихся книгах.

2. Создать экземпляр класса HashSet, добавить в него 25 экземпляров класса Book,
предусмотреть не менее 6 одинаковых книг. Вывести на экран информацию о книгах (содержащихся в коллекции HashSet),
название которых начинается с гласной буквы.

3. Отсортировать коллекцию из 25 книг по фамилии, затем по имени,
по отчеству автора книги (эти поля надо добавить в класс Book).

4. Создать экземпляр класса TreeSet, поместить в него объекты класса Student (надо его спроектировать).
Вывести на экран информацию о каждом чётном в списке студенте, каждого нечётного студента удалить из коллекции.

6. public class User {
       private Long id;
       private String name;
       private String surname;

       private List<User> friends;

//Вывести список имен друзей пользователя до 5 уровня вложенности
}
//Слава -> {Матвей, Лиза, Ваня, Артем} -> {} -> {} -> {} -> {}*/


package homework9;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static homework9.BookUtil.*;

public class Demo {

    public static final char[] VOWELS = {'A', 'E', 'I', 'O', 'U', 'Y'};

    public static final int LINKED_LIST_BOOKS_COUNT = 20;
    public static final int LINKED_LIST_IDENTICAL_BOOKS_COUNT = 0;
    public static final int BOOK_INDEX_TO_REMOVE = 7;
    public static final int HASH_SET_BOOKS_COUNT = 25;
    public static final int HASH_SET_IDENTICAL_BOOKS_COUNT = 6;


    public static void main(String[] args) {

        //task 1
        List<Book> booksLinkedList = generateBooksLinkedList(LINKED_LIST_BOOKS_COUNT, LINKED_LIST_IDENTICAL_BOOKS_COUNT);
        booksLinkedList.remove(BOOK_INDEX_TO_REMOVE);
        printBooksLinkedList(booksLinkedList);

        //task 2
        System.out.println("\nList of 25 books which contains 6 the same books:");
        List<Book> booksForHashSet = generateBooksLinkedList(HASH_SET_BOOKS_COUNT, HASH_SET_IDENTICAL_BOOKS_COUNT);
        printBooksLinkedList(booksForHashSet);

        Set<Book> booksHashSet = new HashSet<>(booksForHashSet);
        printBooksHashSet(booksHashSet); //print all books
        printBooksHashSet(booksHashSet, VOWELS); // print books that starts from vowel


    }//end of main
}//end of class

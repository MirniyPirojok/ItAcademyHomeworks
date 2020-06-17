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

import homework9.domain.Book;
import homework9.exceptions.ResourceCannotBeCreatedException;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static homework9.util.BookUtil.*;

public class BookDemo {

    public static final char[] VOWELS = {'A', 'E', 'I', 'O', 'U', 'Y'};

    public static final int LINKED_LIST_BOOKS_COUNT = 20;
    public static final int BOOK_INDEX_TO_REMOVE = 7;
    public static final int IDENTICAL_BOOKS_COUNT = 6;
    public static final int LINKED_LIST_BOOKS_COUNT_FOR_SORT = 25;


    public static void main(String[] args) {

        //task 1
        List<Book> booksLinkedList;

        try {
            booksLinkedList = generateBooksForLinkedList(LINKED_LIST_BOOKS_COUNT);
            System.out.println("Linked list of books:");
            printBooks(booksLinkedList);
        } catch (ResourceCannotBeCreatedException e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            booksLinkedList.remove(BOOK_INDEX_TO_REMOVE);
            System.out.println("\nIndex " + BOOK_INDEX_TO_REMOVE + " was removed.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nThere is no index " + BOOK_INDEX_TO_REMOVE + " in the list. Nothing to remove.");
        }

        //task 2
        List<Book> booksForHashSet = generateBooksForHashSet(booksLinkedList, IDENTICAL_BOOKS_COUNT);//here is 25 books
        System.out.println("Books for HashSet:");
        printBooks(booksForHashSet);

        Set<Book> booksHashSet = new HashSet<>(booksForHashSet);
        System.out.println("\nBooks of HashSet:");
        printBooks(booksHashSet); //print all books of HashSet
        printBooks(booksHashSet, VOWELS); // print books that starts from vowel

        //task3
        List<Book> booksForSort = generateBooksForLinkedList(LINKED_LIST_BOOKS_COUNT_FOR_SORT);

        System.out.println("\nSorted books by author name: ");
        booksForSort.sort(Comparator.comparing(Book::getAuthorName));
        printBooks(booksForSort);

        System.out.println("\nSorted books by author middlename: ");
        booksForSort.sort(Comparator.comparing(Book::getAuthorMiddlename));
        printBooks(booksForSort);

        System.out.println("\nSorted books by author surname: ");
        booksForSort.sort(Comparator.comparing(Book::getAuthorSurname));
        printBooks(booksForSort);

    }//end of main
}//end of class

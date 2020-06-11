/*1. Создать экземпляр класса LinkedList, разместить в нём 20 объектов класса Book.
Вывести информацию о всех книгах. Программно удалить из коллекции 7-ю книгу,
 вывести на экран информацию об оставшихся книгах.*/

package homework9;

import java.util.List;
import java.util.Set;

import static homework9.BookUtil.generateHashSetBooks;
import static homework9.BookUtil.generateLinkedListBooks;
import static homework9.BookUtil.printBooks;

public class Demo {

    public static final int LINKED_LIST_BOOKS_COUNT = 20;
    public static final int BOOK_INDEX_TO_DEL = 7;
    public static final int HASH_SET_BOOKS_COUNT = 25;
    public static final int SAME_BOOKS_COUNT = 6;

    public static void main(String[] args) {
        //task 1
        List<Book> bookLinkedList = generateLinkedListBooks(LINKED_LIST_BOOKS_COUNT);
        bookLinkedList.remove(BOOK_INDEX_TO_DEL);
        printBooks(bookLinkedList);

        //task 2
        Set<Book> bookHashSet = generateHashSetBooks(HASH_SET_BOOKS_COUNT, SAME_BOOKS_COUNT);
        printBooks(bookHashSet);


    }//end of main
}//end of class

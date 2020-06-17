package exception;

import homework9.Book;
import homework9.BookUtil;

import java.util.List;

public class ExceptionsDemo {
    public static void main(String[] args) {


        List<Book> books = BookUtil.generateBooksForLinkedList(10);

        try {
            Book java = Util.searchInBook("Java1", books);
            System.out.println(java);
        } catch (ResourceNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}


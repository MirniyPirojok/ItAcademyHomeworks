package practiceexception;

import homework8and9.domain.Book;
import homework8and9.util.BookUtil;

import java.util.List;

public class ExceptionsDemo {
    public static void main(String[] args) {


        List<Book> books = BookUtil.generateBooksForLinkedList(10);

        try {
            Book java = ExceptionUtil.searchInBook("Java1", books);
            System.out.println(java);
        } catch (ResourceNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}


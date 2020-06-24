package practiceexception;

import homework8and9.domain.Book;

import java.util.List;

public class ExceptionUtil {
    public static Book searchInBook(String query, List<Book> books) {
        for (Book book: books) {
            if (book.getBookName().contains(query)){
                return book;
            }
        }
        throw new ResourceNotFoundException("Book was not found by query " + query);
    }
}

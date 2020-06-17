package exception;

import homework9.Book;

import java.util.List;

public class Util {
    public static Book searchInBook(String query, List<Book> books) {
        for (Book book: books) {
            if (book.getBookName().contains(query)){
                return book;
            }
        }

        throw new ResourceNotFoundException("Book was not found by query " + query);
    }
}

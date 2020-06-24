package homework8and9.util;

import homework8and9.domain.Book;
import homework8and9.exceptions.ResourceCannotBeCreatedException;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import static homework8and9.data.Names.BOOK_NAMES;
import static homework8and9.data.Names.MIDDLENAMES;
import static homework8and9.data.Names.NAMES;
import static homework8and9.data.Names.SURNAMES;

public class BookUtil {


    public static String generateBookName() {
        int bookNumber = new Random().nextInt(BOOK_NAMES.length);
        return BOOK_NAMES[bookNumber];
    }

    public static String generateAuthorName() {
        int authorNumber = new Random().nextInt(NAMES.length);
        return NAMES[authorNumber];
    }

    public static String generateAuthorMiddlename() {
        int authorNumber = new Random().nextInt(MIDDLENAMES.length);
        return MIDDLENAMES[authorNumber];
    }

    public static String generateAuthorSurname() {
        int authorNumber = new Random().nextInt(SURNAMES.length);
        return SURNAMES[authorNumber];
    }

    public static Book generateBook(int bookId) {
        Book book = new Book(bookId);
        book.setBookName(generateBookName());
        book.setAuthorName(generateAuthorName());
        book.setAuthorMiddlename(generateAuthorMiddlename());
        book.setAuthorSurname(generateAuthorSurname());
        return book;
    }

    public static List<Book> generateBooksForLinkedList(int booksCount) {
        if (booksCount <= 0) {
            throw new ResourceCannotBeCreatedException("Books list cannot be created with count " + booksCount);
        }
        List<Book> books = new LinkedList<>();
        for (int i = 0; i < booksCount; i++) {
            books.add(generateBook(i));
        }
        return books;
    }

    public static List<Book> generateBooksForHashSet(List<Book> books, int identicalBooksCount) {
        Book lastBook = books.get(books.size() - 1); //get the last book from the list
        System.out.println("\n*** Add " + identicalBooksCount + " identical books into the list ***");
        for (int i = 0; i < identicalBooksCount; i++) {
            books.add(lastBook);
        }
        return books;
    }

    public static void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void printBooks(Set<Book> books) {
        int i = 0; //order number to print
        for (Book book : books) {
            System.out.println(i++ + ") " + book);
        }
    }

    public static void printBooks(Set<Book> books, char[] vowels) {
        System.out.println("\n*** Set of books which start from vowel letter ***");

        for (Book book : books) { //find book names that starts from a vowel
            char firstCharacter = book.getBookName().charAt(0); //take the first letter of the book name
            for (char vowel : vowels) { //compare first letters with vowel letters
                if (firstCharacter == vowel) { //if the first letter is a vowel
                    System.out.println(book); //then print this book
                }
            }
        }
    }
}//end of class

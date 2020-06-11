package homework9;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class BookUtil {

    static final int HASH_SET_INITIAL_CAPACITY = 25;

    static final String[] bookName = {"Java", "C++", "C", "Pascal", "Fortran", "Basic",
            "JavaScript", "Python", "Assembler", "Swift", "Objective C", "Kotlin", "SQL"};
    static final String[] authorNames = {"Ivan", "Petr", "Dmitriy", "Yaroslav"};
    static final String[] authorMiddleNames = {"Ivanovich", "Petrovich", "Dmitrievich", "Alekseevich"};
    static final String[] authorSurnames = {"Ivanov", "Petrov", "Sidorov", "Borisov"};



    private static String generateBookName() {
        int bookNumber = new Random().nextInt(bookName.length);
        return bookName[bookNumber];
    }

    private static String generateName() {
        int authorNumber = new Random().nextInt(authorNames.length);
        return authorNames[authorNumber];
    }

    private static String generateMiddleName() {
        int authorNumber = new Random().nextInt(authorMiddleNames.length);
        return authorMiddleNames[authorNumber];
    }

    private static String generateSurname() {
        int authorNumber = new Random().nextInt(authorSurnames.length);
        return authorSurnames[authorNumber];
    }

    private static Book generateBook(long bookId) {
        Book book = new Book();
        book.setBookId(bookId);
        book.setBookName(generateBookName());
        book.setAuthorName(generateName());
        book.setAuthorMiddlename(generateMiddleName());
        book.setAuthorSurname(generateSurname());
        return book;
    }


    public static List<Book> generateLinkedListBooks(int booksCount) {
        LinkedList<Book> books = new LinkedList<>();

        for (int i = 0; i < booksCount; i++) {
            books.add(generateBook(i));
        }
        return books;
    }

    public static Set<Book> generateHashSetBooks(int booksCount, int sameBooksCount){
        HashSet<Book> books = new HashSet<>(HASH_SET_INITIAL_CAPACITY);

        for (int i = sameBooksCount; i < booksCount; i++) {
            books.add(generateBook(i));
        }
        return books;
    }

    public static void printBooks(List<Book> books) {
        System.out.println();
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void printBooks(Set<Book> books) {
        System.out.println();
        for (Book book : books) {
            System.out.println(book);
        }
    }

}//end of class

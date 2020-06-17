package homework9;


import homework9.exceptions.ResourceCannotBeCreatedException;

import java.util.*;

public class BookUtil {

    public static final String[] bookName = {"Java", "C++", "C", "Pascal", "Fortran", "Basic",
            "JavaScript", "Python", "Assembler", "Swift", "Objective C", "Kotlin", "SQL"};
    public static final String[] authorNames = {"Ivan", "Petr", "Dmitriy", "Yaroslav", "Andrei"};
    public static final String[] authorMiddleNames = {"Ivanovich", "Petrovich", "Dmitrievich", "Alekseevich"};
    public static final String[] authorSurnames = {"Ivanov", "Petrov", "Sidorov", "Borisov"};

    public static String generateBookName() {
        int bookNumber = new Random().nextInt(bookName.length);
        return bookName[bookNumber];
    }

    public static String generateAuthorName() {
        int authorNumber = new Random().nextInt(authorNames.length);
        return authorNames[authorNumber];
    }

    public static String generateAuthorMiddlename() {
        int authorNumber = new Random().nextInt(authorMiddleNames.length);
        return authorMiddleNames[authorNumber];
    }

    public static String generateAuthorSurname() {
        int authorNumber = new Random().nextInt(authorSurnames.length);
        return authorSurnames[authorNumber];
    }

    public static Book generateBook(int bookId) {
        Book book = new Book();
        book.setBookId(bookId);
        book.setBookName(generateBookName());
        book.setAuthorName(generateAuthorName());
        book.setAuthorMiddlename(generateAuthorMiddlename());
        book.setAuthorSurname(generateAuthorSurname());
        return book;
    }

    public static List<Book> generateBooksForLinkedList(int booksCount) {
        if (booksCount <= 0){
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

    public static void printBooks(TreeSet<Book> books) {
        int i = 0; //order number to print
        for (Book book : books) {
            System.out.println(i++ + ") " + book);
        }
    }

}//end of class

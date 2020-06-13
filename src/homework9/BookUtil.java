package homework9;


import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class BookUtil {

    public static final String[] bookName = {"Java", "C++", "C", "Pascal", "Fortran", "Basic",
            "JavaScript", "Python", "Assembler", "Swift", "Objective C", "Kotlin", "SQL"};
    public static final String[] authorNames = {"Ivan", "Petr", "Dmitriy", "Yaroslav"};
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

    public static List<Book> generateBooksLinkedList(int booksCount) {
        List<Book> books = new LinkedList<>();
        for (int i = 0; i < booksCount; i++) {
            books.add(generateBook(i));
        }
        return books;
    }

    public static List<Book> generateBooksHashSet(List<Book> books, int identicalBooksCount) {
        Book lastBook = books.get(books.size() - 1); //get the last book from the list
        System.out.println("\n*** Add " + identicalBooksCount + " identical books to the list ***");
        for (int i = 0; i < identicalBooksCount; i++) {
            books.add(lastBook);
        }
        return books;
    }

    public static void printBooksLinkedList(List<Book> books) {
        System.out.println();
        System.out.println("*** Linked List of books ***");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void printBooksHashSet(Set<Book> books) {
        System.out.println("\n*** HashSet of books ***");
        int i = 0; //order number to print
        for (Book book : books) {
            System.out.println(i++ + ") " + book);
        }
    }

    public static void printBooksHashSet(Set<Book> books, char[] vowels) {
        System.out.println();
        System.out.println("\n*** HashSet of books which start from vowel letter ***");

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

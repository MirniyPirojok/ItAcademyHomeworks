package homework9;


import java.util.*;

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

    static Book[] generateBooks(int booksCount) {
        Book[] books = new Book[booksCount];
        for (int i = 0; i < booksCount; i++) {
            books[i] = generateBook(i);
        }
        return books;
    }

    static Book[] generateBooks(int booksCount, int sameBooksCount) {
        Book[] books = new Book[booksCount];
        for (int i = 0; i < booksCount; i++) {
            if (i > booksCount - sameBooksCount) {
                books[i] = books[i - 1];
            } else {
                books[i] = generateBook(i);
            }
        }
        return books;
    }

    public static List<Book> generateBooksLinkedList(int booksCount) {
        Book[] generatedBooks = generateBooks(booksCount);
        List<Book> books = new LinkedList<>();

        for (Book generatedBook : generatedBooks) {
            books.add(generatedBook);
        }
        return books;
    }

    public static Set<Book> generateBooksHashSet(int booksCount, int sameBooksCount) {
        Book[] generatedBooks = generateBooks(booksCount, sameBooksCount);
        HashSet<Book> books = new HashSet<>(HASH_SET_INITIAL_CAPACITY);

        for (Book generatedBook : generatedBooks) {
            books.add(generatedBook);
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
        System.out.println();
        System.out.println("*** HashSet of books which start from vowel letter ***");

        int i = 0;
        for (Book book : books) {
            char firstCharacter = book.getBookName().charAt(0);
            char[] vowels = {'A', 'E', 'I', 'O', 'U', 'Y'};
            for (char vowel : vowels) {
                if (firstCharacter == vowel) {
                    System.out.print(i++ + ") ");
                    System.out.println(book);
                }
            }
        }
    }

}//end of class

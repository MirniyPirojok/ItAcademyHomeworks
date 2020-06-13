package homework9;

import java.util.Objects;

public class Book {
    int bookId;

    String bookName;
    String authorName;
    String authorMiddlename;
    String authorSurname;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorMiddlename() {
        return authorMiddlename;
    }

    public void setAuthorMiddlename(String authorMiddlename) {
        this.authorMiddlename = authorMiddlename;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    @Override
    public String toString() {
        return "Book #" + bookId +
                ": \"" + bookName + "\"" +
                " " + authorName +
                " " + authorMiddlename +
                " " + authorSurname;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(authorMiddlename, book.authorMiddlename) &&
                Objects.equals(authorSurname, book.authorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, authorMiddlename, authorSurname);
    }
}//end of class

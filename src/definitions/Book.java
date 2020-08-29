/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private final boolean defalutBookAvailability = true;
    private String nameOfBook;
    private String authorOfBook;
    private String ISBNNumberOfBook;
    private boolean bookAvailability;

    public Book(String nameOfBook, String authorOfBook) {
        this.nameOfBook = nameOfBook;
        this.authorOfBook = authorOfBook;
    }

    public Book(String ISBNNumberOfBook) {
        if (ISBNNumberOfBook.length() == 13) {
            this.ISBNNumberOfBook = ISBNNumberOfBook;
        } else {
            System.out.println("Invalid ISBN Number");
        }
    }

    public Book() {
        this.nameOfBook = "THIS BOOK IS NOT AVAILABLE";
        this.authorOfBook = "NOT FOUND AUTHOR NAME";
        this.ISBNNumberOfBook = "INVALID ISBN CODE";
        this.bookAvailability = defalutBookAvailability;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    public String getISBNNumberOfBook() {
        return ISBNNumberOfBook;
    }

    public void setISBNNumberOfBook() {
        if (ISBNNumberOfBook.length() == 13) {
            this.ISBNNumberOfBook = ISBNNumberOfBook;
        } else {
            System.out.println("Invalid ISBN Number");
        }
    }

    @Override
    public String toString() {
        return String.format("Book Name: %s, Author Name: %s, ISBN Number: %s", getNameOfBook(), getAuthorOfBook(), getISBNNumberOfBook());
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !(object instanceof Book)) {
            return false;
        }
        Book book = (Book) object;
        return Objects.equals(this.getNameOfBook(), book.getNameOfBook()) &&
                Objects.equals(this.getAuthorOfBook(), book.getAuthorOfBook()) &&
                Objects.equals(this.getISBNNumberOfBook(), book.getISBNNumberOfBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfBook(), getAuthorOfBook(), getISBNNumberOfBook());
    }

    /**
     * Set name of the book and  author of the book.
     *
     * @param nameOfBook   Name of the Book.
     * @param authorOfBook Author Name of the Book.
     */
    public void addBook(String nameOfBook, String authorOfBook) {
        setNameOfBook(nameOfBook);
        setAuthorOfBook(authorOfBook);
    }
}
/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    private final int LIBRARY_CAPACITY = 100;
    private static int totalBooksInLibrary = 0;
    private Book[] availableBookInLibrary;

    public Library(Book[] availabelBookInLibrary) {
        this.availableBookInLibrary = availabelBookInLibrary;
    }

    public Library() {
        availableBookInLibrary = new Book[LIBRARY_CAPACITY];
        for (int index = 0; index < availableBookInLibrary.length; index++) {
            availableBookInLibrary[index] = new Book();
        }
    }

    public Book[] getAvailableBookInLibrary() {
        return availableBookInLibrary;
    }

    public void setAvailableBookInLibrary(Book[] availableBookInLibrary) {
        this.availableBookInLibrary = availableBookInLibrary;
    }

    public int getLibraryCapacity() {
        return LIBRARY_CAPACITY;
    }

    public String toString() {
        return String.format("Available book in Library: %s", Arrays.toString(availableBookInLibrary));
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Library library = (Library) object;
        return Arrays.equals(this.getAvailableBookInLibrary(), library.getAvailableBookInLibrary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAvailableBookInLibrary(), getLibraryCapacity());
    }

    /**
     * book Add to Library.
     *
     * @param nameOfBook   Name of the Book.
     * @param authorOfBook Author name of the Book.
     */
    public void addBook(String nameOfBook, String authorOfBook) {
        for (Book book : availableBookInLibrary) {
            if (book.getNameOfBook().equals("This book is not available")) {
                book.addBook(nameOfBook, authorOfBook);
                totalBooksInLibrary++;
                System.out.println(nameOfBook + "Book is added successfully.");
                break;
            }
        }
    }

    /**
     * Book remove from Library.
     *
     * @param nameOfBook   Name of the Book.
     * @param authorOfBook Author name of the Book.
     */
    public void removeBook(String nameOfBook, String authorOfBook) {
        boolean bookRemoved = false;
        for (Book book : availableBookInLibrary) {
            if (book.getNameOfBook().equalsIgnoreCase(nameOfBook) && book.getAuthorOfBook().equalsIgnoreCase(authorOfBook)) {
                ;
                book.bookRemove();
                bookRemoved = true;
                break;
            }
        }
        if (!bookRemoved) {
            System.out.println("Book is not available");
        } else if (bookRemoved) {
            System.out.println(nameOfBook + "Book is removed successfully.");
        }
    }

    /**
     * It shows the details of all the books which is available in library.
     */
    public void listOfBooks() {
        for (Book book : availableBookInLibrary) {
            System.out.println(book);
        }
    }
}
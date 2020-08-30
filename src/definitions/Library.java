/*  Created by IntelliJ IDEA.
 *  User: Hemant Mudgal
 *  Date: 27/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    private static int totalBooksInLibrary;
    private final int LIBRARY_CAPACITY = 100;
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

    public static void issueBook(String bookName) {
        System.out.println(bookName + "book has been issued to you successfully .");
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

    public static void returnBook(String bookName) {
        System.out.println(bookName + " has been returned successfully . ");
    }

    public void listOfBooksIssued() {
        for (Book book : this.availableBookInLibrary) {
            System.out.println(book);
        }
    }
}

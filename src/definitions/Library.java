/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

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

    public int getLIBRARY_CAPACITY() {
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
}


/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private static int totalBooksInLibrary = 0;
    private final int CAPACITY_OF_LIBRARY = 100;
    private Book[] availableBooksInLibrary;

    public Library(Book[] booksCurrentlyAvailableInLibrary) {
        this.availableBooksInLibrary = availableBooksInLibrary;
    }

}

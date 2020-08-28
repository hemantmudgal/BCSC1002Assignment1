/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String nameOfBook;
    private String authorOfBook;
    private String ISBNNumberOfBook;

    public Book(String nameOfBook, String authorOfBook) {
        this.nameOfBook = nameOfBook;
        this.authorOfBook = authorOfBook;
    }
}

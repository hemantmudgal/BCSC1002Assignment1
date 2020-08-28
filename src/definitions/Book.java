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

    public Book(String ISBNNumberOfBook) {
        if (ISBNNumberOfBook.length() == 13) {
            this.ISBNNumberOfBook = ISBNNumberOfBook;
        } else {
            System.out.println("Invalid ISBN Number");
        }
    }
}

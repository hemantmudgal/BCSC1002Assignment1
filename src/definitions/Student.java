/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private static int initialNumberofBookIssuedByStudent = 0;
    private final int LIMIT_ON_ISSUING_BOOK_FORSTUDENT = 3;
    private String firstName;
    private String middleName;
    private String lastName;
    private long rollNumber;
    private int totalBookSIssuedByStudent;
    private Book[] BooksIssuedByStudent;
}

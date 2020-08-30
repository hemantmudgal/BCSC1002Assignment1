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
    private int totalBooksIssuedByStudent;
    private Book[] booksIssuedByStudent;

    public Student(String firstName, String middleName, String lastName, long rollNumber, int totalBookSIssuedByStudent, Book[] booksIssuedByStudent) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
        this.totalBooksIssuedByStudent = totalBookSIssuedByStudent;
        this.booksIssuedByStudent = booksIssuedByStudent;
    }

    public Student() {
        this.firstName = "NOT Found";
        booksIssuedByStudent = new Book[LIMIT_ON_ISSUING_BOOK_FORSTUDENT];
        for (int index = 0; index < booksIssuedByStudent.length; index++) {
            booksIssuedByStudent[index] = new Book();
        }
        totalBooksIssuedByStudent = 0;
    }

    public Student(String firstNameOfStudent) {
        this.firstName = firstNameOfStudent;
        booksIssuedByStudent = new Book[LIMIT_ON_ISSUING_BOOK_FORSTUDENT];
        for (int index = 0; index < booksIssuedByStudent.length; index++) {
            booksIssuedByStudent[index] = new Book();
        }
    }

    public static int getInitialNumberofBookIssuedByStudent() {
        return initialNumberofBookIssuedByStudent;
    }

    public Book[] getBooksIssuedByStudent() {
        return booksIssuedByStudent.clone();
    }

    public void setBooksIssuedByStudent(Book[] booksIssuedByStudent) {
        this.booksIssuedByStudent = booksIssuedByStudent;
    }

    public int getTotalBooksIssuedByStudent() {
        return totalBooksIssuedByStudent;
    }

    public void setTotalBooksIssuedByStudent(int totalBooksIssuedByStudent) {
        this.totalBooksIssuedByStudent = totalBooksIssuedByStudent;
    }

    public long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(long rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getLIMIT_ON_ISSUING_BOOK_FORSTUDENT() {
        return LIMIT_ON_ISSUING_BOOK_FORSTUDENT;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

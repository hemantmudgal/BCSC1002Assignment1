/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ADD_NEW_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int MY_ISSUES_BOOK = 3;
    private static final int EXIT = 4;
    private static final int SHOW_BOOKS = 3;
    private static final int INSERT_ISBN = 0;
    private static final int STUDENT = 2;
    private static final int LIBRARIAN = 1;
    private static final int REMOVE_BOOK = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputByTheUser;
        Student student = new Student();
        while (true) {
            System.out.println("Select Your Identity");
            System.out.println("1.Librarian");
            System.out.println("2.Student");
            System.out.println("3.Faculty");
            System.out.println("4.Exit");

            int enteredIdentity = scanner.nextInt();
            if (enteredIdentity == STUDENT) {
                System.out.println("Please Enter Your Name");
                scanner.nextLine();
                student.setFirstName(scanner.nextLine());
                System.out.println("Enter Your Roll NO: ");
                student.setRollNumber(scanner.nextLong());
                do {
                    System.out.println("-=-=-=-=Welcome To Front End Desk=-=-=-=-");
                    System.out.println("How may I help today?");
                    System.out.println("1. Issue a new book for me: ");
                    System.out.println("2. Return a previously issued book for me: ");
                    System.out.println("3. Show me all my issued books: ");
                    System.out.println("4. Exit: ");
                    scanner.nextInt();
                    inputByTheUser = scanner.nextInt();
                    switch (inputByTheUser) {
                        case MY_ISSUES_BOOK -> {
                            System.out.println("Enter the name of the book which you want");
                            scanner.nextLine();
                            String bookName = scanner.nextLine();
                            System.out.println("Author of the book" + bookName);
                            String authorName = scanner.nextLine();
                            student.bookReturn(bookName, authorName, library);
                        }
                        case RETURN_BOOK -> {
                            System.out.println("Enter Book name: ");
                            scanner.nextLine();
                            String bookName = scanner.nextLine();
                            System.out.println("Enter author name of book" + bookName);
                            String authorName = scanner.nextLine();
                            student.bookReturn(bookName, authorName, library);
                        }
                        case SHOW_BOOKS -> student.issuedBooksDetails();
                        case EXIT -> System.out.println("Successfully Exit");
                        default -> System.out.println("Invalid Choice");
                    }
                } while (inputByTheUser != EXIT);
            } else if (enteredIdentity == LIBRARIAN) {
                Library library = new Library();
                do {
                    System.out.println("-=-=-=-=Welcome To Front End Desk=-=-=-=-");
                    System.out.println("How may I help today?");
                    System.out.println("1. Add a book: ");
                    System.out.println("2. Remove a book: ");
                    System.out.println("3. Show me all books: ");
                    System.out.println("0. Set ISBN code of a book: ");
                    System.out.println("4. Exit: ");
                    System.out.println("Enter your choice (0..4): ");
                    inputByTheUser = scanner.nextInt();
                    switch (inputByTheUser) {
                        case ADD_NEW_BOOK -> {
                            System.out.println("Enter the name of the Book you want to add: ");
                            scanner.nextLine();
                            String bookName = scanner.nextLine();
                            System.out.println("Enter the author of the " + bookName);
                            String authorName = scanner.nextLine();
                            library.addBook(bookName, authorName);
                        }
                        case REMOVE_BOOK -> {
                            System.out.println("Enter the name of the Book you want to remove: ");
                            scanner.nextLine();
                            String bookName = scanner.nextLine();
                            System.out.println("Enter the author of the " + bookName);
                            String authorName = scanner.nextLine();
                            library.removeBook(bookName, authorName);
                        }
                        case INSERT_ISBN -> {
                            System.out.println("Enter the name of the Book you want to set ISBN: ");
                            scanner.nextLine();
                            String bookName = scanner.nextLine();
                            System.out.println("Enter the author of the " + bookName);
                            String authorName = scanner.nextLine();
                            System.out.println("Enter ISBN code of the " + bookName);
                            String bookISBNCode = scanner.nextLine();
                            library.setBookIsbnNumber(bookName, authorName, bookISBNCode);
                        }
                        case SHOW_BOOKS -> library.listOfBooks();
                        case EXIT -> System.out.println("Successfully Exit");
                        default -> System.out.println("WRONG CHOICE");
                    }
                } while (inputByTheUser != EXIT);
            } else if (enteredIdentity == EXIT) {
                System.out.println("You Successfully Exit");
                break;
            }
        }
    }
}

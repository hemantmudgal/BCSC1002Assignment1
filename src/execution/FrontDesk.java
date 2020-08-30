/*  Created by IntelliJ IDEA.
 *  User: Hemant Mudgal
 *  Date: 27/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;

import java.util.Scanner;

public class FrontDesk {
    private static final int ADD_NEW_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int ISSUED_BOOK = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputByTheUser;
        Library library = new Library();
        do {
            System.out.println("-=-=--=-=-Welcome To The Front Desk-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me: ");
            System.out.println("2. Return a previously issued book for me: ");
            System.out.println("3. Show me all my issued books: ");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice (1..4): ");
            inputByTheUser = scanner.nextInt();

            switch (inputByTheUser) {
                case ADD_NEW_BOOK:
                    System.out.println("Enter the name of the book you want to read: ");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    Library.issueBook(bookName);
                    break;

                case RETURN_BOOK:
                    System.out.println("Enter the name of the book you want to return: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    Library.returnBook(bookName);
                    break;

                case ISSUED_BOOK:
                    System.out.println("Enter the name of the book");
                    scanner.nextLine();
                    String nameOfBook = scanner.nextLine();
                    Library.issueBook(nameOfBook);
                    break;
                default:
            }
        }
        while (inputByTheUser != EXIT);
        {
            scanner.close();
        }
    }
}

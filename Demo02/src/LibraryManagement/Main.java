package LibraryManagement;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.loadFromFile();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("1 for adding Book,2 for borrowing Book,3 for return Book,4 for showing all Books,5 for exit.");
            try {
                int n = input.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("Enter Book id:");
                        String id1 = input.next();
                        System.out.println("Enter Book name:");
                        String title1 = input.next();
                        Book book = new Book(id1, title1);
                        library.addBook(book);
                        break;
                    case 2:
                        System.out.println("Enter Book id:");
                        String id2 = input.next();
                        library.borrowBook(id2);
                        break;
                    case 3:
                        System.out.println("Enter Book id:");
                        String id3 = input.next();
                        library.returnBook(id3);
                        break;
                    case 4:
                        library.showAllBooks();
                        break;
                    case 5:
                        library.saveToFile();
                        return;
                }
            }catch (InputMismatchException e){
                System.out.println("Illegal input, please input number command.");
                input.nextLine();
            }
        }
    }
}

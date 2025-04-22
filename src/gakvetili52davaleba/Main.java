package gakvetili52davaleba;

import java.sql.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)throws Exception{
        String url="jdbc:postgresql://localhost:5432/LibraryManagementSystem";
        String username="postgres";
        String password="tatuliko2008";
        try{
            Scanner scanner = new Scanner(System.in);
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connected Database!");
            System.out.println("Please type librarian's id to read his/her info: ");
            int choice = scanner.nextInt();
            LibrarianMethods.readLibrarian(conn,choice);
            System.out.println("Please type librarian's id that you want to delete");
            int choice2=scanner.nextInt();
            LibrarianMethods.DeleteLibrarian(conn,choice2);
            System.out.println("Make a librarian?");
            System.out.println("(id, full_name, email, phone_number, hire_date)");
            int id=scanner.nextInt();
            scanner.nextLine();
            String full_name=scanner.nextLine();
            String email =scanner.nextLine();
            String number = scanner.nextLine();
            LibrarianMethods.AddLibrarian(conn,id,full_name,email,number);
            System.out.println("Update a librarian?");
            System.out.println("Enter which librarian id and which new number you want to set");
            int newid= scanner.nextInt();
            scanner.nextLine();
            String newnum= scanner.nextLine();
            LibrarianMethods.updateNumber(conn,newid,newnum);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

package gakvetili53davaleba;

import java.sql.*;
import java.util.Scanner;

import static gakvetili53davaleba.PhonebookMethods.*;

public class Main {
    public static void main(String[] args) throws Exception{
        String url="jdbc:postgresql://localhost:5432/PhonebookManagementSystem";
        String username="postgres";
        String password="tatuliko2008";
        try{
            Scanner scanner = new Scanner(System.in);
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connected Database!");
            System.out.println("Welcome to Phonebook v2.0 (with improvements)");

            while(true) {
                System.out.println("1. Add a number");
                System.out.println("2. Delete a number");
                System.out.println("3. Update a number");
                System.out.println("4. Print the current phonebook");
                System.out.println("5. Print info about a number (coming soon)");
                System.out.println("6. Exit");

                int answer = scanner.nextInt();

                if (answer == 1) {
                    System.out.println("Please enter the following information about the Person (Phone number, First name, Last name, Email");
                    String phone_number = scanner.next();
                    String first_name = scanner.next();
                    String last_name = scanner.next();
                    String email = scanner.next();

                    AddNumber(conn, phone_number, first_name, last_name, email);
                }

                else if (answer == 2) {
                    System.out.println("Please enter the number that you want to delete");
                    String phone_number = scanner.next();

                    DeleteNumber(conn, phone_number);
                }

                else if (answer == 3) {
                    System.out.println("What would you like to update?");
                    System.out.println("1. First name");
                    System.out.println("2. Last name");
                    System.out.println("3. email");

                    int choice = scanner.nextInt();

                    if (choice == 1) {
                        System.out.println("Please enter the phone number you want to update and the new first name");
                        String phone_number = scanner.next();
                        String first_name = scanner.next();

                        UpdateFirstName(conn, phone_number, first_name);
                    }

                    else if (choice == 2) {
                        System.out.println("Please enter the phone number you want to update and the new last name");
                        String phone_number = scanner.next();
                        String last_name = scanner.next();

                        UpdateLastName(conn, phone_number, last_name);
                    }


                    else if (choice == 3) {
                        System.out.println("Please enter the phone number you want to update and the new email");
                        String phone_number = scanner.next();
                        String email = scanner.next();

                        UpdateEmail(conn, phone_number, email);
                    }

                    else {
                        System.out.println("INCORRECT INPUT!");
                    }
                }

                else if (answer == 4) {
                    GetContacts(conn);
                }

                else if (answer == 6) {
                    System.out.println("Have a nice day!");
                    break;
                }

                else {
                    System.out.println("INCORRECT INPUT!");
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

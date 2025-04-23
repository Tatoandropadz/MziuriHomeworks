package gakvetili53davaleba;

import java.sql.*;


public class PhonebookMethods {
    public static void DeleteNumber(Connection conn, String phone_number) throws SQLException {
        String query = "DELETE FROM phonebook WHERE phone_number = ?";
        PreparedStatement pS = conn.prepareStatement(query);
        pS.setString(1, phone_number);
        int rows = pS.executeUpdate();
        System.out.println("Rows affected/deleted: "+rows);
        pS.close();
    }


    public static void AddNumber(Connection conn, String phone_number, String first_name,
                                 String last_name, String email) throws SQLException {
        String query = "INSERT INTO phonebook(phone_number, first_name, last_name, email) VALUES (?, ?, ?, ?)";
        PreparedStatement pS = conn.prepareStatement(query);
        pS.setString(1, phone_number);
        pS.setString(2, first_name);
        pS.setString(3, last_name);
        pS.setString(4, email);

        int rows = pS.executeUpdate();
        System.out.println("Rows affected/deleted: "+rows);
        pS.close();
    }


    public static void UpdateFirstName(Connection conn, String phone_number, String first_name) throws SQLException {
        String query = "UPDATE phonebook SET first_name = ? WHERE phone_number = ?";
        PreparedStatement pS = conn.prepareStatement(query);
        pS.setString(1, first_name);
        pS.setString(2, phone_number);

        int rows = pS.executeUpdate();
        System.out.println("Rows affected/deleted: "+rows);
        pS.close();
    }


    public static void UpdateLastName(Connection conn, String phone_number, String last_name) throws SQLException {
        String query = "UPDATE phonebook SET last_name = ? WHERE phone_number = ?";
        PreparedStatement pS = conn.prepareStatement(query);
        pS.setString(1, last_name);
        pS.setString(2, phone_number);

        int rows = pS.executeUpdate();
        System.out.println("Rows affected/deleted: "+rows);
        pS.close();
    }


    public static void UpdateEmail(Connection conn, String phone_number, String email) throws SQLException {
        String query = "UPDATE phonebook SET email = ? WHERE phone_number = ?";
        PreparedStatement pS = conn.prepareStatement(query);
        pS.setString(1, email);
        pS.setString(2, phone_number);

        int rows = pS.executeUpdate();
        System.out.println("Rows affected/deleted: "+rows);
        pS.close();
    }


    public static void GetContacts(Connection conn) throws SQLException{
        String query = "SELECT * FROM phonebook";
        PreparedStatement pS = conn.prepareStatement(query);

        ResultSet rS = pS.executeQuery();
        while(rS.next()) {
            String phone_number = rS.getString("phone_number");
            String first_name = rS.getString("first_name");
            String last_name = rS.getString("last_name");
            String email = rS.getString("email");
            System.out.println(phone_number+" "+first_name+" "+last_name+" "+email);
        }

        pS.close();
    }
}

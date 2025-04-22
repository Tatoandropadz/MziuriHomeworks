package gakvetili52davaleba;

import java.sql.*;

public class LibrarianMethods {
    public static void readLibrarian(Connection conn,int id)throws SQLException{
        String query="select * from librarians1 where librarian_id = ?";
        PreparedStatement pS=conn.prepareStatement(query);
        pS.setInt(1,id);
        ResultSet rS=pS.executeQuery();
        while(rS.next()){
            int librarian_id = rS.getInt("librarian_id");
            String fullName = rS.getString("full_name");
            String number = rS.getString("phone_number");
            System.out.println(librarian_id+" : "+fullName+" : "+number);
        }
        pS.close();
    }
    public static void DeleteLibrarian(Connection conn,int librarian_id)throws SQLException{
        String query="delete from librarians1 where librarian_id = ?";
        PreparedStatement pS = conn.prepareStatement(query);
        pS.setInt(1,librarian_id);
        int rows=pS.executeUpdate();
        System.out.println("Rows affected/deleted "+rows);
        pS.close();
    }
    public static void AddLibrarian(Connection conn,int librarian_id,
                                    String full_name,String email, String mobileNumber)throws SQLException{
        String query = "insert into librarians1(librarian_id, full_name, email, phone_number) VALUES(?, ?, ?, ?)";
        PreparedStatement pS=conn.prepareStatement(query);
        pS.setInt(1,librarian_id);
        pS.setString(2,full_name);
        pS.setString(3,email);
        pS.setString(4,mobileNumber);
        int rows=pS.executeUpdate();
        System.out.println("Rows inserted: "+rows);
        pS.close();
    }
    public static void updateNumber(Connection conn, int librarian_id,String mobile)throws SQLException{
        String query = "update librarians1 set phone_number = ? where librarian_id = ?";
        PreparedStatement pS= conn.prepareStatement(query);
        pS.setString(1,mobile);
        pS.setInt(2,librarian_id);
        int rows= pS.executeUpdate();
        System.out.println("Rows affected = "+rows);
        pS.close();
    }
}

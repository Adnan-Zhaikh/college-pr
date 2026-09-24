package com.example.nep;

import javax.naming.Name;
import java.sql.*;

public class JDBCArchitecture {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String pass = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            System.out.println("Student table:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id")+ ", Name:" + rs.getString("name"));
            }
            con.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

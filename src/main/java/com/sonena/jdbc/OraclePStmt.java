package com.sonena.jdbc;

import java.sql.*;

public class OraclePStmt {

    public static void main(String args[]){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" ,"hr", "1234");
           // Statement stmt = con.prepareStatement("Select * from  JOB_HISTORY;");
            PreparedStatement stmt = con.prepareStatement("Select * from employees");
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

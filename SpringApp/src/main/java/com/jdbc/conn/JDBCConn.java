package com.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConn {
    static final String DB_URL = "jdbc:oracle:thin:@oracle.cise.ufl.edu:1521:orcl";
    static final String USER = "t.matukumalli";
    static final String PASS = "afutrU2BKlhhXCZzskztYoPF";

    public static void main(String[] args) throws SQLException {
        // Open a connection
        DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
            String sql = "CREATE TABLE GROUP24(x int, y int)";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

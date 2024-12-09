package com.finance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/personal_finance"; // Your DB URL
    private static final String USER = "root"; // Your DB username
    private static final String PASSWORD = "apsar000"; // Your DB password

    public static Connection initializeDatabase() throws SQLException, ClassNotFoundException {
        // Load the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Create and return a connection to the database
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

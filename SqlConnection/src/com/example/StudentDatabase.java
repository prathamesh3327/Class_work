package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDatabase {
    // Database URL, username, and password
    private static final String DB_URL = "jdbc:mysql://localhost:3306/javademo";
    private static final String DB_USER = "root1"; // Replace with your DB username
    private static final String DB_PASSWORD = "root"; // Replace with your DB password

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // SQL query to insert data
            String insertSQL = "INSERT INTO students (name, roll) VALUES (?, ?)";

            // Create PreparedStatement
            preparedStatement = connection.prepareStatement(insertSQL);

            // Set parameters
            preparedStatement.setString(1, "John Doe");
            preparedStatement.setInt(2, 101);

            // Execute update
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new student was inserted successfully!");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

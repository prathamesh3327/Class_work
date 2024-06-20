package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SecondJdbc {

  // Database URL, username, and password
  private static final String DB_URL = "jdbc:mysql://localhost:3306/javademo";
  private static final String DB_USER = "root1"; // Replace with your DB username
  private static final String DB_PASSWORD = "root"; // Replace with your DB password

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    // Load the JDBC driver
    Class.forName("com.mysql.cj.jdbc.Driver");

    // Get a connection to the database
    Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

    // Prepare the SQL statement with placeholders for values
    String query = "INSERT INTO students (name, roll) VALUES (?, ?)"; // ? for values
    PreparedStatement preparedStatement = con.prepareStatement(query);

    // Set the values for the placeholders based on your table schema
    preparedStatement.setString(1, "prathamesh"); // Name
    preparedStatement.setInt(2, 101); // Roll number (assuming it's an integer)
    // Don't set a value for the first placeholder (id) as it's auto-incremented

    // Execute the update and get the number of rows affected
    int rowsAffected = preparedStatement.executeUpdate();

    // Print success message based on rows affected
    if (rowsAffected > 0) {
      System.out.println("Student data inserted successfully!");
    } else {
      System.out.println("No rows affected. Data insertion might have failed.");
    }

    // Close the connection
    con.close();
  }
}

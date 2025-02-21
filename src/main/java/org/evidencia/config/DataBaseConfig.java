package org.evidencia.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConfig {
  //  Database connection credentials
  private static final String URL = "jdbc:postgresql://localhost:5432/test";
  private static final String USER = "admin";
  private static final String PASSWORD = "admin";

  public static Connection getConnection() throws SQLException {
    try {
      return DriverManager.getConnection(URL, USER, PASSWORD);
    } catch (SQLException e) {
      throw new SQLException("Error connecting to database: ", e);
    }
  }
}

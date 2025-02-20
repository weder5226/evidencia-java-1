package org.evidencia;

import org.evidencia.config.DataBaseConfig;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
  public static void main(String[] args) {
    System.out.println("Testing execution");

    try (Connection connection = DataBaseConfig.getConnection()) {
      if (connection != null) {
        System.out.println("Successfully connecting to DB");
      }
    } catch (SQLException e) {
      System.err.println("DB error:" + e.getMessage());
    }
  }
}

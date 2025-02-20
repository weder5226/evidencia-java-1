package org.evidencia.dao;

import org.evidencia.config.DataBaseConfig;
import org.evidencia.model.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientDAO {
  private final String CREATE_SQL = "INSERT INTO clients (first_name, last_name, id_number, phone_number, city, address, email) VALUES (?, ?, ?, ?, ?, ?, ?)";

  public void createClient(Client client) {
    try {
      Connection connection = DataBaseConfig.getConnection();
      assert connection != null;
      PreparedStatement statement = connection.prepareStatement(CREATE_SQL);

      statement.setString(1, client.getFirstName());
      statement.setString(2, client.getLastName());
      statement.setString(3, client.getIdNumber());
      statement.setString(4, client.getPhoneNumber());
      statement.setString(5, client.getCity());
      statement.setString(6, client.getAddress());
      statement.setString(7, client.getEmail());

      int rowsAffected = statement.executeUpdate();
      boolean wasSuccess = rowsAffected > 0;
      if (wasSuccess) System.out.println("Client created");

    } catch (SQLException e) {
      System.err.println("Error creating client: " + e.getMessage());
    }
  }
}

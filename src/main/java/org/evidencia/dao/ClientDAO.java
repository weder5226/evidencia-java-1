package org.evidencia.dao;

import org.evidencia.config.DataBaseConfig;
import org.evidencia.model.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO {
  private final String CREATE_SQL = "INSERT INTO clients (first_name, last_name, id_number, phone_number, city, address, email) VALUES (?, ?, ?, ?, ?, ?, ?)";
  private final String SELECT_ALL_SQL = "SELECT id, first_name, last_name, id_number, phone_number, city, address, email FROM clients";

  public void create(Client client) {
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

  public void getAll() {
    List<Client> clients = new ArrayList<>();

    try {
      Connection connection = DataBaseConfig.getConnection();
      assert connection != null;
      Statement statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery(SELECT_ALL_SQL);

      while (resultSet.next()) {
        Client client = new Client(
            resultSet.getString("first_name"),
            resultSet.getString("last_name"),
            resultSet.getString("id_number"),
            resultSet.getString("phone_number"),
            resultSet.getString("city"),
            resultSet.getString("address"),
            resultSet.getString("email")
        );
        client.setId(resultSet.getInt("id"));
        clients.add(client);
      }

      if (clients.isEmpty()) {
        System.out.println("No clients found");
      } else {
        System.out.println("Clients list:");
        clients.forEach(System.out::println);
      }

    } catch (SQLException e) {
      System.err.println("Error retrieving clients: " + e.getMessage());
    }
  }
}

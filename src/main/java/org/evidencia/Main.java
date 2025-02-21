package org.evidencia;

import org.evidencia.dao.ClientDAO;
import org.evidencia.model.Client;

public class Main {
  public static void main(String[] args) {
    System.out.println("Testing execution");

//    CRUD
    createClient();
    getAllClients();
    updateClient(1);
    deleteClient(1);
  }

  public static void createClient() {
    Client newClient = new Client(
        "Juan",
        "Perez",
        "112233",
        "987654321",
        "Bogota",
        "Calle Falsa 123",
        "juan.perez@email.com"
    );

    ClientDAO clientDAO = new ClientDAO();
    clientDAO.create(newClient);
  }

  public static void getAllClients() {
    ClientDAO clientDAO = new ClientDAO();
    clientDAO.getAll();
  }

  public static void updateClient(int clientId) {
    Client updatedClient = new Client(
        "Pepito",
        "Gonzalez",
        "11223344",
        "99887766",
        "Medellín",
        "Calle Verdadera 456",
        "pepito.gonzalez@email.com"
    );
    updatedClient.setId(clientId);

    ClientDAO clientDAO = new ClientDAO();
    clientDAO.update(updatedClient);
  }

  public static void deleteClient(int clientId) {
    ClientDAO clientDAO = new ClientDAO();
    clientDAO.delete(clientId);
  }
}
package org.evidencia;

import org.evidencia.dao.ClientDAO;
import org.evidencia.model.Client;

public class Main {
  public static void main(String[] args) {
    System.out.println("Testing execution");
//    createClient();
    getAllClients();
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
}
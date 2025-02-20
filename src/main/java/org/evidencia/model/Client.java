package org.evidencia.model;

public class Client {
  private int id;
  private String firstName;
  private String lastName;
  private String idNumber;
  private String phoneNumber;
  private String city;
  private String address;
  private String email;

  public Client(String firstName, String lastName, String idNumber, String phoneNumber, String city, String address, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.idNumber = idNumber;
    this.phoneNumber = phoneNumber;
    this.city = city;
    this.address = address;
    this.email = email;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}

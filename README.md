# Evidencia con JDBC y PostgreSQL

Este proyecto implementa un CRUD básico (Crear, Leer, Actualizar, Eliminar) para gestionar clientes usando JDBC y PostgreSQL.

## Requisitos

- Java 21
- PostgreSQL
- Maven

## Funcionalidades

- **Crear cliente**
- **Leer clientes**
- **Actualizar cliente**
- **Eliminar cliente**

## Ejecución

1. Configura PostgreSQL en local con la base de datos `test`
2. Ejecuta `Main.java` para probar las operaciones CRUD

## Estructura de la base de datos

```sql
CREATE TABLE clients (
  id           SERIAL PRIMARY KEY,
  first_name   VARCHAR(100),
  last_name    VARCHAR(100),
  id_number    VARCHAR(20) NOT NULL UNIQUE,
  phone_number VARCHAR(30),
  city         VARCHAR(50),
  address      VARCHAR(80),
  email        VARCHAR(80)
);
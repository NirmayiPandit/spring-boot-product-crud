# spring-boot-product-crud
A simple Spring Boot application for managing products with full CRUD functionality. Built using Spring Data JPA and H2 in-memory database.

# Spring Boot Product CRUD Application

## Introduction
This is a simple Spring Boot application that allows users to perform CRUD operations on products. It uses H2 as an in-memory database and JPA for data persistence.

## Features
- Create, Read, Update, and Delete products.
- In-memory database for testing purposes.
- RESTful API endpoints.

## Technologies Used
- Java 21
- Spring Boot 3.x.x
- Spring Data JPA
- H2 Database

## Setup Instructions

### Steps to Run Locally
1. Clone the repository: https://github.com/NirmayiPandit/spring-boot-product-crud.git
2. Navigate to the project directory:cd spring-boot-product-crud
3. Build the project using Maven:mvn clean install

OR
Just open it in IntelliJ and Click on Run.

### Accessing the Application:
- The application runs on `http://localhost:8080`.
- Use tools like Postman or cURL to interact with the REST API.

## API Endpoints

| Method | Endpoint         | Description                |
|--------|------------------|----------------------------|
| POST   | `/products`      | Create a new product       |
| GET    | `/products`      | Get all products           |
| GET    | `/products/{id}` | Get a product by ID        |
| PUT    | `/products/{id}` | Update a product by ID     |
| DELETE | `/products/{id}` | Delete a product by ID     |

## Project Status
This is a completed project for learning purposes.

## License
This project is open-source under the MIT License.



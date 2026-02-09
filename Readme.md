
# Supermarket API - Management Microservice
This microservice is part of a service-oriented architecture designed for comprehensive supermarket management. 
It is built following backend development best practices, prioritizing scalability, and clean code.

### Tech Stack
Java 21: Core language.
Spring Boot 4: Framework for microservice creation.
Spring Data JPA: For data persistence.
Maven: Dependency management.
Lombok: To reduce boilerplate code.
H2 Database & MySQL: for data storage.

### The project follows a layered architecture to ensure maintainability and testability:

Controller: REST endpoint exposure.
Service: Business logic implementation.
Repository: Data access layer.
Model/Entity: Domain object definitions.

### Key Features
Full CRUD operations for products (Create, Read, Update, Delete).
Inventory and stock management.
Custom exception handling.
Input data validation.

### Setup and Installation
Pre-requisites
JDK 21 or higher.
Maven 3.8+.

### Steps to Run Locally
Clone the repository:

git clone http://github.com/Omarit82/supermarket.git

Navigate to the project directory:

cd supermarket-api

Run application with Maven

./mvnw spring-boot:run

The API will be available at: http://localhost:8080

### Project Structure

src/main/java/com/webapp/supermecado/
├── controller/    # REST Endpoints
├── service/       # Business Logic
├── repository/    # Data Access
├── model/         # JPA Entities
└── dto/           # Data Transfer Objects

### Contact
If you have any questions about this project, feel free to reach out:

LinkedIn: linkedin.com/in/omar-roselli/

Email: roselliomar82@gmail.com
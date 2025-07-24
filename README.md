# Employee CRUD API with Spring Data REST

## Description

This project is a RESTful API for managing employee data, built with Spring Boot. It supports CRUD operations and uses Spring Data REST to automatically expose repository methods as REST endpoints, eliminating the need for Service and REST Controller layers.

## Technologies Used

- Spring Boot 3
- Spring 6
- Spring Data JPA
- Spring Data REST
- Hibernate (JPA)
- MySQL
- Maven
- Swagger UI for API documentation and testing

### Dependencies

- **springdoc-openapi-starter-webmvc-ui**: Added to enable Swagger UI for interactive API documentation and testing (version 2.8.9).

## How to Run the Project

1. **Clone the repository**:

   ```bash
   git clone https://github.com/abdalrhman002/employee-crud-spring-data-rest.git
   ```

2. **Navigate to the directory**:

   ```bash
   cd employee-crud-spring-data-rest
   ```

3. **Set up the database**:

    - Create a MySQL database named `employee_db`.
    - Update `application.properties` with your database credentials.

4. **Run the application**:

   ```bash
   mvn spring-boot:run
   ```

5. **Access Swagger UI**:

    - Open your browser and go to `http://localhost:8080/ui.html`.
    - Use Swagger UI to explore and test the auto-generated API endpoints, including HATEOAS links.

## Approach Explanation

This project uses Spring Data REST to create a fully functional API with minimal code:

- **Repository Interface**: Extends `JpaRepository`, and Spring Data REST auto-generates REST endpoints.
- **HATEOAS Support**: Responses include hypermedia links for navigation (e.g., `_links` for self, collection).
- **No Service or Controller**: The API is exposed directly from the repository, simplifying the architecture.

This approach is ideal for rapid development and prototyping, especially when standard CRUD operations are sufficient.

## API Documentation

- **Swagger UI**: Available at `http://localhost:8080/ui.html` for interactive API testing.
- **OpenAPI Docs**: Available at `http://localhost:8080/api-doc` for the API specification.
- **Note**: Spring Data REST endpoints are auto-documented, including HATEOAS links.

## Related Projects

Explore other implementations:
- [DAO, Service, REST Controller Version](https://github.com/abdalrhman002/employee-crud-dao-service-rest)
- [Spring Data JPA Version](https://github.com/abdalrhman002/employee-crud-spring-data-jpa)



#  :books: Bookstore API

A simple backend CRUD application for managing book categories and books.

## Features

- Create, read, update, and delete book categories.
- Create, read, update, and delete books.
- Establish a one-to-many relationship between categories and books (one category can have many books).
- Ensure that each book belongs to exactly one category.

## Technologies Used

- **Java**: Backend language.
- **Spring Boot**: Framework for building Java applications.
- **Spring Data JPA**: For database interaction.
- **MySQL**: Relational database management system.
- **Maven**: Build and dependency management.
- 
## Getting Started

1. Clone this repository.
2. Set up your MySQL database.
3. Configure the database connection in `application.properties`.
4. Run the application using Maven: `mvn spring-boot:run`.

## API Endpoints

- **Categories**:
  - `GET /api/categorias`: Get a list of all categories.
  - `GET /api/categorias/{categoryId}`: Get details of a specific category.
  - `POST /api/categorias`: Create a new category.
  - `PUT /api/categorias/{categoryId}`: Update an existing category.
  - `DELETE /api/categorias/{categoryId}`: Delete a category.

- **Books**:
  - `GET /api/livros?categoria={categoryId}`: Get a list of all books of a specific categorie.
  - `GET /api/livros/{bookId}`: Get details of a specific book.
  - `POST /api/livros?categoria={categoryId}`: Create a new book in a specific categorie.
  - `PUT /api/livros/{bookId}`: Update an existing book.
  - `DELETE /api/livros/{bookId}`: Delete a book.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open a pull request or submit an issue.

## Author
[Gustavo Sá](https://github.com/gsbad)

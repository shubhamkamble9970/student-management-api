# Student Management System

A full stack web application built with Spring Boot and MySQL.

## Tech Stack
- Backend : Java 17, Spring Boot 3.x, Spring Data JPA
- Database : MySQL
- Frontend : HTML, CSS, JavaScript (Fetch API)

## Features
- Add new students
- View all students
- Delete students
- REST API with full CRUD operations

## API Endpoints
| Method | URL              | Description        |
|--------|------------------|--------------------|
| GET    | /students        | Get all students   |
| GET    | /students/{id}   | Get student by ID  |
| POST   | /students        | Add new student    |
| PUT    | /students/{id}   | Update student     |
| DELETE | /students/{id}   | Delete student     |

## How to Run
1. Create MySQL database: `CREATE DATABASE studentdb;`
2. Update `application.properties` with your MySQL password
3. Run: `./mvnw spring-boot:run`
4. Open `index.html` in browser

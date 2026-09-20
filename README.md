# Task Manager REST API

A backend Task Manager application built using Spring Boot and PostgreSQL.  
The application provides REST APIs to create, read, update, and delete tasks.

## 🚀 Features

- Create a new task
- Get all tasks
- Get a task by ID
- Update an existing task
- Delete a task
- PostgreSQL database integration
- Spring Data JPA / Hibernate
- Spring Security configuration
- RESTful API architecture

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- PostgreSQL
- Spring Security
- Maven
- Postman
- Git & GitHub

## 📁 Project Structure

```text
src
└── main
    ├── java
    │   └── com.sujal.taskmanager
    │       ├── controller
    │       │   └── TaskController.java
    │       ├── entity
    │       │   └── Task.java
    │       ├── repository
    │       │   └── TaskRepository.java
    │       ├── service
    │       │   └── TaskService.java
    │       ├── SecurityConfig.java
    │       └── TaskmanagerApplication.java
    │
    └── resources
        └── application.properties
# Student Management System (SMS) - Spring Boot Application

## Overview

This is a simple Student Management System built using Spring Boot. The project utilizes Spring Boot Web Starter, Spring Data JPA with JDBC, Thymeleaf for templating, and Bootstrap for frontend styling.

**Note:** This project was created as part of my learning journey while following the course [Learn Spring Boot](https://www.udemy.com/course/learn-spring-boot/) on Udemy.

## Features

- **Spring Boot Web Starter:** For building the web application.
- **Spring Data JPA with JDBC:** For database operations.
- **Thymeleaf:** For server-side rendering of HTML templates.
- **Bootstrap:** For responsive and stylish UI.

## Prerequisites

Before you begin, ensure you have the following installed on your local machine:

- [Java 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven 3.6+](https://maven.apache.org/install.html)
- [MySQL](https://dev.mysql.com/downloads/installer/) or any other preferred database.

## Setup

### 1. Cloning the Project

To clone the repository, run the following command:

```bash
git clone https://github.com/soham-pagi/student-management-system-springboot.git
cd student-management-system-springboot
```

### 2. Create the database:

Open your MySQL or preferred database tool and run the following SQL command to create a database:
(**Note**: Tables will be automatically created by JPA)
```bash
CREATE DATABASE sms;
```

### 3. Configure the application properties:
Open the src/main/resources/application.properties file and configure your database settings:
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/sms
spring.datasource.username=<your-database-username>
spring.datasource.password=<your-database-password>
```

### 4. Build the project:

Navigate to the root directory of the project and build it using Maven:

```bash
mvn clean install
```

### 5. Run the application:

Start the Spring Boot application using the following command:

```bash
mvn spring-boot:run
```

Alternatively, you can run the JAR file created in the target directory:

```bash
java -jar target/<your-jar-file>.jar
```

### 6. Accessing the Application
Once the application is running, you can access it in your web browser at:

```
http://localhost:8080
```

## Technologies Used
- Java 17+
- Spring Boot
- Spring Data JPA
- Thymeleaf
- Bootstrap
- MySQL
# User-Service
The User-Service repository is a microservice-based application that provides a User Management Service, built using Java, Spring framework, and MongoDB, a popular NoSQL database. The service offers REST API endpoints for creating, reading, updating, and deleting user entities, with support for secure authentication and authorization features. The codebase is designed to be modular, scalable, and efficient, making use of ChatGPT's AI technology to create lean services that can handle high volumes of traffic.

## Technology Stack
    . Java 11
    . Spring Boot - for production-grade Spring-based applications.
    . Lombok - for generating boilerplate code, such as getters, setters, constructors, and more.

### Step to run microservice on local machine
- clone service with ```git clone https://github.com/InnovateXT/User-Service-AGC.git```
  or ```git clone git@github.com:InnovateXT/User-Service-AGC.git```
- build service with
  ```./gradlew clean build```
- execute service with
  ```./gradlew bootRun```

### Directory Structure
Here's a brief overview of the directories and files:

- src: This directory contains the source code of the application.
- main: This directory contains the main source code of the application.
- java: This directory contains the Java source code of the application.
- com.innovateXT.user: This is the package of the application.
- UserApplication.java: This is the main class of the application that starts the Spring Boot application.
- controller: This directory contains the controller classes of the application.
- service: This directory contains the service classes of the application.
- repository: This directory contains the repository classes of the application.
- model: This directory contains the entity classes of the application.
- dto: This directory contains the data transfer object (DTO) classes of the application.
- exception: This directory contains the custom exception classes of the application.
- resources: This directory contains the non-Java resources of the application.
- application.properties: This file contains the configuration properties for the application.
- test: This directory contains the unit and integration tests of the application.
- build.gradle: This file contains the project configuration and dependencies.
- README.md: This file contains the documentation for the project.
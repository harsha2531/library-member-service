
---

## 7. `member-service`

**Repository About description:**  
> REST API for managing library members (CRUD) using MongoDB. Part of Library Management System.

```markdown
# Member Service

## Mandatory Information

- **Student Name**: [B.K.Harsha Nimeda Sirithunga]
- **Student Number**: [2301691058]
- **Slack Handle**: [@Harsha Nimeda]
- **GCP Project ID**: [indigo-splice-491917-q2]

## Project Description

The **Member Service** handles member registration and management for the Library Management System. It stores member data in **MongoDB** and exposes REST endpoints for CRUD operations. Each member has a unique `memberCode` and can be looked up by email or member code. The service registers itself with Eureka for service discovery.

## Technology Stack

- Java 25
- Spring Boot 3.4.5
- Spring Data MongoDB
- MongoDB
- Spring Cloud Netflix Eureka Client
- Spring Cloud Config Client
- Spring Boot Actuator

## Setup / Getting Started Instructions

### Prerequisites
- Java 25
- Maven
- MongoDB (running locally on default port 27017)
- Config Server (port 8888)
- Eureka Server (port 8761)

### Database Setup

MongoDB does not require manual database creation. The database `member_db` will be created automatically when the first document is inserted.

### Configuration

The service fetches its configuration (MongoDB URI, Eureka, server port) from the Config Server. Ensure `member-service.yml` exists in the Config Server's `configurations` folder.

### Run the Service

```bash
mvn spring-boot:run

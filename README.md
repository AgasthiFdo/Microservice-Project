AGMS - Automated Greenhouse Management System 
# Automated Greenhouse Management System (AGMS)

A cloud-native, microservices-based system designed to enhance crop yield and efficiently manage greenhouse environments using real-time IoT data and automated decision-making.

---

## Table of Contents
- Overview
- Architecture & Tech Stack
- System Requirements
- External Dependencies
- Microservices
- Getting Started
- Service Verification
- API Testing
- Postman Collection

---

## Overview
The Automated Greenhouse Management System (AGMS) is built to monitor and control greenhouse conditions automatically.  

It connects with an external IoT data provider to collect live environmental data such as temperature and humidity. A custom rule engine processes this data and triggers actions (e.g., turning on fans) to maintain optimal conditions for plant growth.

---

## Architecture & Tech Stack

This project follows a **Microservices Architecture** for scalability and modularity.

### 🔧 Technologies
- **Backend Framework:** Spring Boot (Java)
- **Service Discovery:** Spring Cloud Netflix Eureka
- **API Gateway:** Spring Cloud Gateway
- **Configuration Management:** Spring Cloud Config Server
- **Communication:** OpenFeign
- **Security:** JWT Authentication (via API Gateway)
- **Database:** Spring Data JPA (Relational Databases)

---

## System Requirements

### Minimum Requirements
- RAM: 8GB (16GB recommended)
- Java: JDK 17 or higher

### JVM Optimization (Low Memory Systems)
For systems with limited RAM, run services with:


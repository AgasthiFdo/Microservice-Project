# AGMS - Automated Greenhouse Management System 

A cloud-native, microservices-based system designed to enhance crop yield and efficiently manage greenhouse environments using real-time IoT data and automated decision-making.

---

## Table of Contents
- Overview
- Architecture & Tech Stack
- System Requirements
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

---

## Microservices Breakdown
1. **Infrastructure Services:**
   * `eureka-server` (Port: 8761) - Service registry.
   * `config-server` (Port: 8888) - Centralized configuration.
   * `api-gateway` (Port: 8080) - Single entry point & JWT Security.
2. **Domain Services:**
   * `automation-service` (Port: 8083) - Rule engine for decision making. Instructs physical actions based on thresholds.
   * `zone-service` (Port: 8081) - Manages greenhouse sections and limits. Communicates with the IoT server to register new devices.
   * `sensor-service` (Port: 8082) - Fetches telemetry data from the external IoT API every 10 seconds.
   * `crop-service` (Port: 8084) - Manages crop inventory and lifecycle.
  
---

## API Testing & Validation (End-to-End Flow)

A complete set of tested API endpoints has been exported and included in the root directory.
* **File:** `AGMS_Postman_Collection.json`

**Test the workflow:**
1. Import the JSON file to Postman.
2. An Execute - **"Auth: Login Admin"** to retrieve the JWT Bearer Token.
3. Apply - Apply the Bearer Token to the Authorization header of subsequent requests.
4. Execute - **"Zone: Create Zone"** to define thresholds and automatically register a device in the IoT server.
5. Execute - **"Crop: Create Crop Batch"** and **"Update Crop Status"**.
6. Use - **"Automation: Simulate Sensor Data"** to send dummy data (e.g., Extreme heat) to bypass the IoT wait time.
7. Execute **"Automation: Get Logs"** to verify that the rule engine successfully triggered an action (e.g., `TURN_FAN_ON`).

## The system Images

<img width="959" height="539" alt="image" src="https://github.com/user-attachments/assets/aa6229d6-137d-48fe-a653-b4328dbfff31" />


# Microservice Ilyess

This project demonstrates a microservice architecture using Spring Boot, with:

## 🧱 Structure

- **spring-back**: Main backend microservice (REST APIs, business logic)
- **discoveryserver-eureka**: Eureka Server for service discovery
- **apigateway**: API Gateway to route requests and handle security

## ⚙️ Technologies

- Spring Boot
- Eureka Discovery (Netflix OSS)
- Spring Cloud Gateway
- Maven
- Java 17+

## 🚀 How to Run

1. **Start Eureka Server**:  
   Go to `discoveryserver-eureka/` → `mvn spring-boot:run`

2. **Start API Gateway**:  
   Go to `apigateway/` → `mvn spring-boot:run`

3. **Start Spring Backend**:  
   Go to `spring-back/` → `mvn spring-boot:run`

Make sure all services are configured properly in `application.yml` or `application.properties`.

## 📂 Folder Structure

```bash
microservice-ilyess/
├── spring-back/
├── discoveryserver-eureka/
├── apigateway/
└── README.md

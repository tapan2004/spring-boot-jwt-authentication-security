
# 🔐 Spring Boot JWT Authentication & Authorization

A production-ready authentication and authorization system built using **Spring Boot** and **Spring Security**.  
This project demonstrates **stateless JWT authentication**, **role-based access control**, and **secure REST API protection** following industry-standard security practices.

---

## 🚀 Key Features

- Stateless JWT Authentication
- Role-Based Authorization (USER / ADMIN)
- Secure Password Encryption (BCrypt)
- Custom JWT Filter Implementation
- Spring Security Configuration (Modern Approach)
- Secure REST API Endpoints
- Database-backed User Authentication
- Automatic Role Initialization
- Exception Handling for Unauthorized Access

---

## 🏗️ Architecture

This project follows a **layered architecture**:

Controller → Service → Repository → Database
↓
Security Layer (JWT + Spring Security)


---

## 🛠 Tech Stack

- **Java 21**
- **Spring Boot**
- **Spring Security**
- **JWT (JSON Web Token)**
- **Hibernate / JPA**
- **MySQL / H2**
- **Maven**

---

## 📂 Project Structure



src/main/java/com/springboot/jwtauthentication
│── config # Security Configuration
│── controller # REST Controllers
│── service # Business Logic
│── repository # JPA Repositories
│── entity # Database Entities
│── filter # JWT Authentication Filter
│── utils # JWT Utility Class


---

## ⚙️ Setup & Run

### 1️⃣ Clone Repository

```bash
git clone https://github.com/tapan2004/spring-boot-jwt-authentication-security.git
cd spring-boot-jwt-authentication-security

2️⃣ Configure Database

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=root
spring.datasource.password=your_password

3️⃣ Run Application
mvn spring-boot:run


Server starts at:

http://localhost:8080

🔐 API Endpoints
Method	Endpoint	Access	Description
POST	/login	Public	Authenticate user & get JWT
POST	/register	Public	Register new user
GET	/user	USER	Access user data
GET	/admin	ADMIN	Admin-only endpoint
🔑 Security Highlights

Stateless authentication using JWT

Password hashing using BCrypt

Custom JWT request filter

Role-based access restriction

No session storage (REST compliant)

🧪 Default Roles

ROLE_USER

ROLE_ADMIN

📈 Future Enhancements

Refresh Token Mechanism

OAuth2 (Google / GitHub Login)

Docker Containerization

Swagger API Documentation

Email Verification

Rate Limiting & Brute Force Protection

💼 Resume Highlights

Implemented secure JWT authentication system using Spring Security

Designed stateless authentication architecture for REST APIs

Implemented role-based authorization with encrypted password storage

Built secure production-style backend following best security practices

👨‍💻 Author

Tapan Manna

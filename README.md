# 🛡️ SecureBox

SecureBox is a personal learning project built with **Kotlin** and **Spring Boot WebFlux**.  
The goal of this application is to explore **reactive programming** concepts while learning the Kotlin programming language and building a modern non-blocking REST API.

---

## 🎯 Purpose

This project was created as a playground to:
- Learn **Kotlin** and apply it in a backend context
- Understand and implement **Spring WebFlux**
- Practice building **reactive REST APIs** using a functional and modern approach
- Explore non-blocking I/O, coroutines, and reactive patterns

---

## ⚙️ Tech Stack

| Technology        | Role / Purpose                        |
|-------------------|----------------------------------------|
| Kotlin            | Main programming language              |
| Spring Boot 3     | Application framework                  |
| Spring WebFlux    | Reactive and non-blocking web stack    |
| R2DBC             | Reactive database connectivity         |
| PostgreSQL        | Relational database                    |
| Docker / Compose  | Containerization and service orchestration |
| JUnit 5           | Unit testing                           |
| Mockito + AssertJ | Testing utilities                      |
| Swagger / OpenAPI | API documentation                      |

---

## 🚀 Running the App

You can run SecureBox locally using **Docker Compose**:

```bash
docker-compose up --build
```
Or run it manually:

Configure `application.yaml` or `.env` file with your database settings.

Run the app:

```bash
./gradlew bootRun
```

## 📄 API Documentation

Once the app is running, the Swagger UI is available at: http://localhost:8080/swagger-ui.html

## 📁 Project Structure (Simplified)

```json lines
secure-box/
├── src/main/kotlin/
│   └── com/securebox/
│       ├── config/
│       ├── controller/
│       ├── model/
│       ├── repository/
│       ├── service/
│       └── SecureBoxApplication.kt
├── src/test/kotlin/
│   └── com/securebox/
├── docker-compose.yml
└── README.md
```

## 🧠 What I Learned

*✅ Kotlin syntax and idiomatic patterns*

*✅ Spring WebFlux and how it differs from Spring MVC*

*✅ Using coroutines for reactive flow control*

*✅ Connecting to PostgreSQL using R2DBC*

*✅ Creating and testing reactive endpoints*

*✅ Dockerizing a full-stack reactive backend*


## 📌 Future Improvements
* Add authentication (JWT or OAuth2)
* Add pagination and filtering
* Add integration tests with WebTestClient
* Deploy to cloud

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

```
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

1. [x] Kotlin syntax and idiomatic patterns
2. [x] Spring WebFlux and how it differs from Spring MVC
3. [x] Using coroutines for reactive flow control
4. [x] Connecting to PostgreSQL using R2DBC
5. [x] Creating and testing reactive endpoints
6. [x] Dockerizing a full-stack reactive backend


## 📌 Future Improvements
* Add authentication (JWT or OAuth2)
* Add pagination and filtering
* Add integration tests with WebTestClient
* Deploy to cloud

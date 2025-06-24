 # 💊 Pharmacy Management System - Backend

This is the backend service for a **Pharmacy Management System**, built with **Spring Boot**. It provides RESTful APIs to manage patients and other pharmacy-related operations such as prescriptions, inventory, and billing (future scope).

---

## 🚀 Features

- 🧑‍⚕️ **Patient Management** (CRUD)
- 📡 RESTful API endpoints
- 📦 Easy integration with frontend systems
- ✅ Clean architecture using Spring Boot & Maven

---

## 🛠️ Tech Stack

- **Java 17+**
- **Spring Boot**
- **Maven**
- **Spring Data JPA**
- ** MySQL** 

---

## 📦 Getting Started

### ✅ Prerequisites

Ensure you have the following installed:

- [Java 17+](https://adoptopenjdk.net/)
- [Maven 3.6+](https://maven.apache.org/download.cgi)
- [Git](https://git-scm.com/)

### 🔧 Setup & Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/KPabsy/Pharmacy_Management_System_BackEnd.git
   cd Pharmacy_Management_System_BackEnd
 

2. **Build the project**

   ```bash
   mvn clean install
   ```

3. **Run the application**

   ```bash
   mvn spring-boot:run
   ```

   The backend will start at: `http://localhost:8080`

> ⚠️ If port 8080 is in use, change it in `src/main/resources/application.properties`:
>
> ```properties
> server.port=8081
> ```

---

## 📡 API Endpoints

Base URL: `http://localhost:8080/api`

| Method | Endpoint         | Description          |
| ------ | ---------------- | -------------------- |
| GET    | `/patients`      | Get all patients     |
| GET    | `/patients/{id}` | Get patient by ID    |
| POST   | `/patients`      | Create a new patient |
| DELETE | `/patients/{id}` | Delete patient by ID |

📘 Example Request (POST):

```json
{
  "name": "John Doe",
  "age": 34,
  "contact": "1234567890"
}
```

---

## 🧪 Testing

Run unit and integration tests using:

```bash
mvn test
```
---
## 🙌 Acknowledgments
Built with ❤️ using Spring Boot

# 🧑‍💼 Spring Boot Employee Service

This is a microservice built using **Spring Boot** and **MySQL**, designed to handle core Employee management functionalities such as creating, updating, listing, and deleting employee records.

📁 Project Path: [`/employee_service`](https://github.com/bhaveshbabhniya/springboot-employee-service/tree/main/employee_service)

---

## 🚀 Features

- ✅ Create and update employee data
- 📋 Retrieve all or specific employees
- ❌ Delete employees by ID
- 🗃️ Integration with **MySQL** database
- 🧪 Includes REST APIs for CRUD operations
- ⚙️ Uses Spring Boot's best practices

---

## 🛠️ Tech Stack

- **Spring Boot** (REST API)
- **Spring Data JPA** (ORM)
- **MySQL** (Database)
- **Maven** (Dependency Management)
- **Lombok** (Boilerplate Reduction)

---

## 📂 Project Structure
```
employee_service/ 
├── controller/ # REST Controllers 
├── service/ # Business logic 
├── repository/ # Spring Data JPA repositories 
├── model/ # JPA entity classes 
├── resources/ │ 
  ├── application.properties # App configuration 
├── EmployeeServiceApplication.java # Main Spring Boot class
```
---

## 🔧 Setup Instructions

### Prerequisites

- Java 17+ installed
- MySQL running
- Maven installed
- Git

### Clone the repository

```bash
git clone https://github.com/bhaveshbabhniya/springboot-employee-service.git
cd springboot-employee-service/employee_service
```
---

## ▶️ Run the Application
```
./mvnw spring-boot:run
```
Or in Eclipse IDE, run EmployeeServiceApplication.java as a Java application.

---

## 📫 API Endpoints
```
GET | /api/employees  #Get all employees
GET | /api/employees/{id}  #Get employee by ID
POST | /api/employees  #Create new employee
POST | /api/employees/{id}  #Update existing employee
DELETE | /api/employees/{id}  #Delete employee by ID
```
## 🧪 Postman Collection

You can test the API using this ready-to-use Postman collection:

👉 [Click here to view in Postman](https://.postman.co/workspace/My-Workspace~ca6d974d-a19d-44cf-8c3f-7961c0e57a26/collection/19566605-81120c97-bdd7-46d8-b64a-c8a883277135?action=share&creator=19566605)

To use:
- Open the link
- Click **"Fork"** or **"Import"** to your own workspace
- Make sure to update the environment variables (like `{{base_url}}`) if needed

---

# 📌 Notes
- Lombok must be installed and enabled in your IDE.
- Make sure MySQL is running and accessible.
- Consider securing the endpoints for production use.

---

# 👤 Author
  Bhavesh Babhniya
🔗 [`GitHub`](https://github.com/bhaveshbabhniya)

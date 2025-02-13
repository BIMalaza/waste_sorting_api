# bonganimalaza.waste_sorting_api

# Waste Sorting API

## 📌 Project Overview
This is a **Spring Boot REST API** for waste sorting management. It allows users to **create, read, update, and delete (CRUD)** waste categories through a frontend UI built with **HTML, CSS, and JavaScript**.

---

## 🚀 Features
- ✅ **Full REST API**: Supports `GET`, `POST`, `PUT`, and `DELETE` requests  
- ✅ **H2 In-Memory Database**: Stores waste categories temporarily  
- ✅ **Spring Boot Backend**: Handles API requests efficiently  
- ✅ **Frontend UI**: Allows interaction with the backend using JavaScript  
- ✅ **Well-Structured Code**: Follows best practices with services, repositories, and controllers  

---

## 🛠️ Technologies Used
- **Spring Boot** (Java) - Backend API
- **H2 Database** - In-memory storage
- **Maven** - Build tool
- **Postman** - API testing
- **HTML, CSS, JavaScript** - Frontend UI

---

## 🏗️ Project Setup

### **1️⃣ Clone the Repository**
```sh
 git clone https://github.com/BIMalaza/waste_sorting_api
 cd waste-sorting-api

### **2️⃣ Run the Backend (Spring Boot API)
mvn spring-boot:run

### **3️⃣ Run the Frontend (HTML, CSS, JS)
Open browser type http://localhost:8080/


## 🏗️ Project Setup

### **1️⃣ Clone the Repository**
```sh
 git clone <your-repo-url>
 cd waste-sorting-api
2️⃣ Run the Backend (Spring Boot API)
Always show details

mvn spring-boot:run
The API will start at: http://localhost:8080
H2 Console (Database UI): http://localhost:8080/h2-console
3️⃣ Run the Frontend (HTML, CSS, JS)
Open src/main/resources/static/index.html in a browser

📌 API Endpoints
Method	Endpoint	Description
GET	/api/waste-categories	Fetch all waste categories
POST	/api/waste-categories	Add a new waste category
PUT	/api/waste-categories/{id}	Update an existing category
DELETE	/api/waste-categories/{id}

### *** Emport postman collection and test each endpoint the test from UI
Waste Sorting API

# 🧠 MindWorkshop

## 🚀 Overview
**MindWorkshop** is a **scalable, robust, and secure** online bookstore platform designed to redefine the reading experience in Nepal. Built with **Spring Boot, React, MySQL, and AWS**, this full-stack application ensures seamless browsing, secure transactions, and personalized recommendations for Nepali users who love books and aims to promote reading culture in Nepal.

This project embodies **clean code principles, scalable system architecture, and efficient database design**, making it an industry-standard application. It serves as a testament to my **backend engineering expertise, system design knowledge, and full-stack development proficiency**.

---

## 🏗️ Architecture & Tech Stack
### **Backend: Spring Boot & Java 17**
- **Spring Boot 3.0** for microservices-based scalable backend.
- **Spring Data JPA & Hibernate** for efficient database interactions.
- **Spring Security (JWT & OAuth2)** for authentication & authorization.
- **Redis Caching** for optimized performance.
- **RESTful API design** for seamless integration with frontend and external services.

### **Database: MySQL & PostgreSQL**
- **Optimized schema design** for relational data consistency.
- **Indexing & Query Optimization** for performance enhancement.
- **Transaction Management** using ACID principles.

### **Frontend: React & TailwindCSS**
- **React (Next.js) for a dynamic and responsive UI.**
- **React Query** for efficient API handling.
- **Redux/Context API** for state management.
- **TailwindCSS** for a clean, modern user interface.

### **DevOps & Deployment: Docker & AWS**
- **Dockerized Microservices** for consistent deployments.
- **AWS (EC2, RDS, S3, IAM)** for cloud scalability.
- **CI/CD Pipeline** using GitHub Actions.
- **Terraform** for Infrastructure as Code (IaC).

### **Testing & Quality Assurance**
- **JUnit & Mockito** for backend testing.
- **React Testing Library & Cypress** for frontend testing.
- **SonarQube & CodeLinting** for code quality monitoring.

---

## 🔥 Key Features
### ✅ **User Management**
- Secure **JWT-based authentication**.
- Role-based access control (RBAC) for **users & admins**.
- OAuth2 integration for seamless **Google & Facebook logins**.

### 📚 **Bookstore Functionalities**
- **Browse & Search Books** with an intuitive interface.
- **Advanced Filtering & Sorting** (genre, price, rating, author).
- **Personalized Recommendations** (machine learning-based suggestions).
- **User Reviews & Ratings** with moderation.
- **Book Wishlist & Favorites** for future purchases.

### 💳 **Order Management & Payment Integration**
- **Cart & Checkout Flow** with discount & promo codes.
- **Stripe & PayPal Integration** for seamless payments.
- **Order Tracking & Invoice Generation**.

### 📊 **Admin Panel & Dashboard**
- **CRUD Operations** for books, users, and orders.
- **Real-time Analytics** on book sales & user engagement.
- **Order Management & Refund Processing**.

### 🏆 **Performance & Optimization**
- **Redis Caching** for frequent queries.
- **Load Balancing** for high availability.
- **Database Indexing** for faster search & retrieval.
- **Asynchronous Processing** for notifications & background tasks.

---

## 🔧 System Design & Scalability
**MindWorkshop** follows **Domain-Driven Design (DDD)** principles with a **layered architecture** ensuring modularity, testability, and maintainability.

### **1️⃣ API Layer (Controllers)**
- **RESTful endpoints** for user interactions.
- **Exception handling** for reliable responses.
- **Request validation & security filters**.

### **2️⃣ Service Layer (Business Logic)**
- **Encapsulation of core business rules**.
- **Caching with Redis** to reduce DB hits.
- **Asynchronous messaging with RabbitMQ/Kafka**.

### **3️⃣ Data Layer (Persistence & Database)**
- **JPA/Hibernate ORM** for structured data handling.
- **Optimized queries & indexing for performance**.

### **4️⃣ Security & Authentication**
- **Spring Security + JWT + OAuth2**.
- **Role-based access control (RBAC)**.
- **Encrypted password storage using BCrypt**.

### **5️⃣ Cloud Deployment & DevOps**
- **Containerized with Docker** for easy deployment.
- **Automated CI/CD Pipelines** with GitHub Actions.
- **AWS Load Balancer for horizontal scaling**.

---

## 🛠️ How to Run Locally
### **1️⃣ Clone Repository**
```bash
git clone https://github.com/kabinshrestha/MindWorkshop.git
cd MindWorkshop
```

### **2️⃣ Set Up Backend**
```bash
cd backend
mvn clean install
mvn spring-boot:run
```

### **3️⃣ Set Up Frontend**
```bash
cd frontend
npm install
npm start
```

### **4️⃣ Run Database with Docker**
```bash
docker-compose up -d
```

---

## 🎯 Why This Project Matters
MindWorkshop is more than just a project—it represents my **commitment to mastering scalable web applications, backend engineering, and modern development practices**. Every component of this system is designed with **real-world production readiness in mind**.

This project has strengthened my expertise in **Spring Boot, MySQL optimizations, API design, authentication systems, system design, React, DevOps, and cloud deployments.** It showcases my ability to build software **not just for functionality, but for performance, security, and maintainability.**

If you're interested in **discussing this project or collaborating**, feel free to reach out! 🚀

---

## 🔗 Connect with Me
💼 [LinkedIn](https://www.linkedin.com/in/kabin7/)  
📧 [Email](mailto:kabinworkspace7@gmail.com)  
🌐 [Portfolio](https://kabinthapa.dev)


# CNKart - E-commerce Backend System

## 🛒 Project Overview
CNKart is a backend system for an e-commerce platform that allows management of products, item details, reviews, and orders. Built using Spring Boot, Hibernate (JPA), and MySQL, it demonstrates clean architecture, RESTful API development, and effective database handling.

## 💻 Tech Stack
- Java 8
- Spring Boot 2.7
- Spring MVC
- Hibernate (JPA)
- MySQL
- Maven

## 📦 Project Modules & Features

### ✅ Item Module
- Add, update, delete, view items

### ✅ Item Details Module
- Manage product specifications and descriptions

### ✅ Item Review Module
- Users can add reviews and ratings to products

### ✅ Order Module
- Order placement and retrieval for customers

## 🏗️ Architecture
- **Controllers** – Handle incoming REST requests
- **DAL (Data Access Layer)** – Interface-based repository logic with implementations
- **Entities** – JPA models for mapping to MySQL tables
- **Configurations** – Hibernate/MySQL setup via application.yml

===========================================================================================================

## 🚀 Getting Started
1. Clone the repo
2. Set your MySQL credentials in `application.yml`
3. Run the app using `mvn spring-boot:run`

## 📜 License
This is a personal project developed for learning and demonstration purposes.


<h1 align="center">Med Voll</h1>

<p align="center">
  <img alt="Java" src="https://img.shields.io/badge/Java-22+-blue.svg">
  <img alt="Maven" src="https://img.shields.io/badge/Maven-3.0-blue.svg">
  <img alt="Spring Boot" src="https://img.shields.io/badge/Spring%20Boot-3.3.0-brightgreen.svg">
  <img alt="PostgreSQL" src="https://img.shields.io/badge/PostgreSQL-16.3-blue.svg">
  <img alt="Status do Projeto" src="https://img.shields.io/badge/status-Build-green">
</p>

<p align="justify"> Application for medical clinic </p>

## How to Clone Properly
Before you can run the project you'll need the following technologies and dependencies:
  - [Java 22](https://www.java.com/pt-BR/download/) at least;
  - [Spring Boot](https://start.spring.io/);
  - Validation
  - Lombok
  - JPA (Java Persistence API);
  - [Database (MySQL)](https://www.mysql.com/downloads/);
  - [Maven](https://maven.apache.org/download.cgi);
    
Clone the repository
    
  ```bash
  git clone git@github.com:dyonneEberty/Med.Voll.git
  ```

Configure the PostgreSQL database:
   - Create a database named "Medvoll_api"
   - In the file application.properties, `src/main/resources/application.properties`, you'll find [environment variables](https://vercel.com/docs/projects/environment-variables). You can either add those to your pc, setting your own information, or replace them with your info directly (I don't recomend this option if you want to post your project after finished because it will leak your infos but if you only wanna have fun it's much simpler). 

## Features
  - Register Doctor 
  - Register Patient
  - Register User (JWT Token authentication)
  - Details entity data
  - Edit entity data
  - Delete (inactive)

## Demo
- Coming soon





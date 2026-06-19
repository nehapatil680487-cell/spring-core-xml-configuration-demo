# Spring Core XML Configuration Demo

## Overview

This project demonstrates the fundamental concepts of the Spring Framework using XML-based configuration.

The application uses Spring's IOC (Inversion of Control) Container to create and manage beans defined in an external XML configuration file. It shows how Spring reduces object creation dependency and manages application components efficiently.

---

## Objectives

* Learn Spring IOC Container
* Understand Bean Management
* Configure Beans using XML
* Implement Maven-based Spring Project
* Retrieve Beans from Application Context

---

## Technologies Used

* Java 17
* Spring Framework 7
* Spring Core
* Spring Context
* Maven
* Eclipse IDE

---

## Project Structure

```text
Springdemo2
│
├── src/main/java
│   └── com.sit.Springdemo2
│       ├── App.java
│       └── User.java
│
├── src/main/resources
│   └── config.xml
│
├── pom.xml
└── target
```

---

## Features

### XML-Based Bean Configuration

Beans are configured externally in the XML file.

Example:

```xml
<bean id="cust1" class="com.sit.Springdemo2.User">
    <property name="userId" value="567"/>
    <property name="userName" value="Sam"/>
</bean>
```

### Bean Retrieval

Beans are loaded from the Spring IOC Container using:

```java
ApplicationContext context =
        new ClassPathXmlApplicationContext("config.xml");
```

### POJO Management

The User class acts as a Plain Old Java Object (POJO) managed by the Spring Container.

---

## Components

### App.java

Main application class responsible for:

* Loading Spring Context
* Retrieving Beans
* Displaying Bean Data

### User.java

POJO class containing:

* userId
* userName

### config.xml

XML configuration file containing bean definitions.

---

## Maven Dependencies

* spring-core
* spring-context
* junit

---

## How to Run

### Step 1

Clone the repository.

### Step 2

Build the project:

```bash
mvn clean install
```

### Step 3

Run:

```text
App.java
```

### Expected Output

```text
Hello World!
User[ UserId=567, UserName=Sam ]
User[ UserId=123, UserName=Sanika ]
```

---

## Spring Concepts Covered

* Inversion of Control (IOC)
* Bean Creation
* Bean Lifecycle
* XML Configuration
* ApplicationContext
* Dependency Management with Maven

---

## Learning Outcomes

This project helped in understanding:

* Spring Framework Basics
* IOC Container
* XML Bean Configuration
* Bean Retrieval
* Maven Dependency Management
* POJO Design

---




## Project Type

Spring Core XML Configuration Mini Project

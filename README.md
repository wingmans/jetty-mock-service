# Jetty Mock Server for SOAP and REST

## Overview

This project provides a simple Jetty-based mock server for both SOAP and REST services. It is intended to serve as a reference for developers looking to create mock servers using Java 17 and Jetty Servlet for testing and development purposes.

## Prerequisites

Before you get started, ensure you have the following prerequisites in place:

- Java Development Kit (JDK) 17 or later.
- Maven for managing project dependencies.
- Basic knowledge of SOAP and REST concepts.

## Getting Started

1. Clone this repository to your local machine:
```bash
git clone https://github.com/your-username/jetty-mock-server.git
```

2. Build the project using Maven:
```
mvn clean install
```

3. Run the main class to start the Jetty server:
```
java -jar target/jetty-mock-server.jar
```

## Usage
Access the mock SOAP service at:

* http://localhost:8080/soap

Access the mock REST service at:

* http://localhost:8080/rest



6a. BUILD with Gradle
#build with ./gradlew build customFatjar

6b. RUN with gradle
$./gradlew build customFatjar
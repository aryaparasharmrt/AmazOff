
# Amazoff

Brief description or introduction to your Spring Boot project.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Installation](#installation)
- [Endpoints](#endpoints)

## Overview

Explain the purpose and scope of the project. Include any relevent details about its functionality and the problems it solves. 

## Features

It have features related to:
- Can get Customer by Id.
- Can get Seller by their name or Id
- Can add Seller and Customer.

## Installation 

You can clone this repository using git command `git clone` and need to add some prerequisites.

### Prerequisites

- Java JDK-17 or above
- Maven-latest version
- Add following dependencies:
  `mysql-connector`: To connect this project with mysql database.
  `spring web`: To run it on server
  `lombok`: for creating each Entitie's user defined variable's getter setter.
  `spring-jpa`: To jpa to create interfaces and for provide ORM Mapping with intigrated usage of Hibernate.

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/aryaparasharmrt/Amazoff.git
   ```
2. Build the project:
   ```
   mvn clean install
   ```

## Endpoints

Use Endpoints or configured `Rest-Apis` to perform web retaled tasks .For testing Apis you may use `Postman` `Insomania`.

### Example
- `GET /api/endpoint` - `https://localhost:8080/Customer/getCustomer/1`
- `POST /api/endpoint` - `https://localhost:8080/Customer/addCustomer`



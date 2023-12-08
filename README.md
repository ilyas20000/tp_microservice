# Microservices Project

This repository contains the source code and documentation for the Microservices project developed as part of the TP (Travaux Pratiques) on Microservices Architecture.

## Table of Contents

1. [Introduction](#introduction)
2. [Project Structure](#project-structure)
3. [Microservices](#microservices)
    - [1. Eureka Service Discovery](#1-eureka-service-discovery)
    - [2. Client Service](#2-client-service)
    - [3. Gateway Service](#3-gateway-service)
    - [4. Voiture Service](#4-voiture-service)
4. [Setting Up and Running the Project](#setting-up-and-running-the-project)
    - [4.1 Local Setup](#41-local-setup)
    - [4.2 Docker Setup](#42-docker-setup)
5. [Usage](#usage)
6. [Contributing](#contributing)
7. [License](#license)


## Project Structure

The project is organized into different modules, each representing a microservice. The main modules include:
- `eureka-service`: Eureka Service Discovery
- `client-service`: Microservice for handling client information
- `gateway-service`: API Gateway for routing requests
- `voiture-service`: Microservice for handling voiture (car) information

## Microservices

### 1. Eureka Service Discovery

The Eureka service discovery module is responsible for managing and registering microservices.

### 2. Client Service

The client service module handles client information, including basic details like name and age.

### 3. Gateway Service

The gateway service acts as a centralized entry point, routing requests to the appropriate microservices.

### 4. Voiture Service

The voiture service module manages information related to cars.

## Setting Up and Running the Project

### 4.1 Local Setup

Follow these steps to set up and run the project locally:

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/microservices-project.git
    ```

2. Navigate to the project directory:

    ```bash
    cd microservices-project
    ```

3. Build and run each microservice module individually using Maven or your preferred IDE.

4. Ensure all microservices are registered with Eureka.

5. Access the Gateway Service to interact with the microservices.

### 4.2 Docker Setup

Follow these steps to set up and run the project using Docker:

1. Ensure Docker is installed on your machine.

2. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/microservices-project.git
    ```

3. Navigate to the project directory:

    ```bash
    cd microservices-project
    ```

4. Build the Docker images for each microservice:

    ```bash
    docker-compose build
    ```

5. Start the Docker containers:

    ```bash
    docker-compose up
    ```

6. Access the Gateway Service at `http://localhost:8888` to interact with the microservices.



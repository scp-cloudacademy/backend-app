# Spring Boot Application (Getting Started Guide)

본 프로젝트는 Spring Boot Web Application 을 적용하기 위한 템플릿 프로젝트 입니다.

## What's Here
```
.
├── src/main
│   ├── java/hello
│   │   └── Application.java
│   └── resources
│       └── application.yml
├── docker
│   └── Dockerfile
└── pom.xml
```

## Getting Started

### Requirements
- Windows, Unix 계열 OS 지원, JDK 1.8 이상  
- maven 3 이상

### Build
```sh
mvn clean package
```

### Run app
```sh
mvn spring-boot:run
```
[http://localhost](http://localhost)에 접속해서 확인하세요.

### Run container image
```sh
# build
# base container image : eclipse-temurin
cp target/*.jar docker/app.jar
cd docker
docker build -t spring-boot .
# run
docker run --rm -p 8080:80 spring-boot 
```
[http://localhost:8080](http://localhost:8080)에 접속해서 확인하세요.

### Reference
- https://spring.io/guides/gs/spring-boot-docker
- https://github.com/spring-guides/gs-spring-boot-docker.git
- https://spring.io/guides/topicals/spring-boot-docker/

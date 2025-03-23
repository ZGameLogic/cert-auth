FROM ubuntu:latest
LABEL authors="Ben Shabowski"

FROM arm64v8/openjdk:21-jdk-buster

WORKDIR /app
COPY /target/auth-cert-1.0.0.jar /app/auth-cert-1.0.0.jar

EXPOSE 8080

CMD ["java", "-jar", "-Dspring.profiles.active=cluster", "auth-cert-1.0.0.jar"]

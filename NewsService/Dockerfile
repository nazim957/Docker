# Stage 1: Build the Java application with Maven
FROM maven:3.8.4-openjdk-17 AS builder
WORKDIR /usr/src/app
COPY . /usr/src/app
RUN mvn clean package

# Stage 2: Create the Docker image
FROM openjdk:17
WORKDIR /usr/src/app
COPY --from=builder /usr/src/app/target/NewsService-0.0.1-SNAPSHOT.jar /usr/src/app/
ENTRYPOINT ["java", "-jar", "NewsService-0.0.1-SNAPSHOT.jar"]

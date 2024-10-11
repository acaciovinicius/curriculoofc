#
# Build stage
#
FROM maven:3.9-eclipse-temurin-17-alpine AS build
WORKDIR /app
COPY ./curriculo/pom.xml ./curriculo/
COPY ./curriculo/src ./curriculo/src
WORKDIR /app/curriculo
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/curriculo/target/curriculo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

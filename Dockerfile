FROM maven:3.8.4-openjdk-17 AS build
COPY src /src
COPY pom.xml .
RUN mvn clean package

FROM openjdk:15
COPY --from=build target/TemperatureConverter-1.0-SNAPSHOT.jar TemperatureConverter-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","TemperatureConverter-1.0-SNAPSHOT.jar"]
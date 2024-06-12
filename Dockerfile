FROM openjdk:17-jdk-slim AS build

COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:resolve

COPY src src
RUN ./mvnw package

FROM openjdk:17-jdk-slim
WORKDIR app-spring-docker
COPY --from=build target/*.jar app-spring-docker-example.jar
ENTRYPOINT ["java", "-jar", "app-spring-docker-example.jar"]
EXPOSE 8080
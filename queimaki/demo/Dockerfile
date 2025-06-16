FROM gradle:8.7-jdk22 AS build
WORKDIR /app
COPY . .
RUN gradle build -x test

FROM eclipse-temurin:22-jdk-alpine
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
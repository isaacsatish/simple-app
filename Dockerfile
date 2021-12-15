FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/*.jar
COPY ${JAR_FILE} simple-app-1.0.0.jar
ENTRYPOINT ["java","-jar","/simple-app-1.0.0.jar"]


FROM openjdk:11-jdk-alpine
ARG JAR_FILE=target/*.jar
ADD ./build/libs/calculator-0.0.1-SNAPSHOT.jar./app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

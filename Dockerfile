FROM openjdk:8-jdk-alpine

MAINTAINER jyotiranjandash4@gmail.com

EXPOSE 8080

ARG JAR_FILE=target/phone-book-backend-0.0.1-SNAPSHOT.jar

VOLUME /tmp

ADD ${JAR_FILE} phoneBook.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/phoneBook.jar"]

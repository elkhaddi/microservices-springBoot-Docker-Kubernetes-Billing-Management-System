FROM openjdk:17
LABEL maintainer="client-service"
VOLUME /main-app
ADD target/client-service-0.0.1-SNAPSHOT.jar client-service.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "client-service.jar"]
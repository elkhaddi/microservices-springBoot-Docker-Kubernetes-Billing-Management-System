FROM openjdk:17
LABEL maintainer="provider-service"
VOLUME /main-app
ADD target/provider-service-0.0.1-SNAPSHOT.jar provider-service.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "provider-service.jar"]
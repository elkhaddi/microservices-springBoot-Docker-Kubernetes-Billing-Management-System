FROM openjdk:17
LABEL maintainer="facturation-service"
VOLUME /main-app
ADD target/facturation-service-0.0.1-SNAPSHOT.jar facturation-service.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "facturation-service.jar"]
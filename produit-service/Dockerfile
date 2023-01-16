FROM openjdk:17
LABEL maintainer="produit-service"
VOLUME /main-app
ADD target/produit-service-0.0.1-SNAPSHOT.jar produit-service.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "produit-service.jar"]
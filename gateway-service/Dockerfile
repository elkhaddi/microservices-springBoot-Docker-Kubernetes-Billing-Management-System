FROM openjdk:17
LABEL maintainer="api-gateway"
VOLUME /registry-app
ADD target/gateway-service-0.0.1-SNAPSHOT.jar gateway.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "gateway.jar"]
FROM openjdk:17
LABEL maintainer="eureka-service-discovery"
VOLUME /registry-app
ADD target/eureka-service-0.0.1-SNAPSHOT.jar eureka.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "eureka.jar"]
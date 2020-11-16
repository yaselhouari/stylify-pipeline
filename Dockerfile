FROM openjdk:15
WORKDIR /
ADD target/explorecali-3.0.0-SNAPSHOT.jar //
EXPOSE 8080
ENTRYPOINT [ "java", "-Dspring.profiles.active=default", "-jar", "/explorecali-3.0.0-SNAPSHOT.jar"]

FROM openjdk:17
EXPOSE 9090
WORKDIR /app
COPY target/autocomplete-1.0.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

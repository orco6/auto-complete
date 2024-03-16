# Use a base image with Java 17 installed
FROM adoptopenjdk:17-jre-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file into the container at /app
COPY target/autocomplete.jar /app

# Command to run your application
CMD ["java", "-jar", "autocomplete.jar"]

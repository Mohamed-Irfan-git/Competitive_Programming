# Stage 1: Build the project with Maven + Java 17
FROM maven:3.9.4-eclipse-temurin-17 AS build

# Set working directory inside container
WORKDIR /app

# Copy pom.xml first (for caching dependencies)
COPY pom.xml .

# Download dependencies
RUN mvn dependency:go-offline

# Copy all source code
COPY src ./src

# Build the project
RUN mvn clean package -DskipTests

# Stage 2: Run the compiled JAR with a smaller JRE image
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copy the compiled JAR from the build stage
COPY --from=build /app/target/*.jar app.jar

# Default command to run the JAR (replace MainClass if needed)
CMD ["java", "-jar", "app.jar"]

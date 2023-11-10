#Version de java
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /gamelife-back

COPY ./.mvn .mvn
COPY ./mvnw ./pom.xml ./
RUN chmod 700 mvnw && ./mvnw clean install package

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
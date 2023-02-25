FROM eclipse-temurin:11.0.18_10-jdk
COPY target/docker-1.0.0.war docker.war
ENTRYPOINT ["java", "-jar", "/docker.war"]
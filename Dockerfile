FROM eclipse-temurin:18.0.1_10-jdk-focal
COPY build/libs/*.jar twitter_clone-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "twitter_clone-0.0.1-SNAPSHOT.jar" ]
FROM openjdk
EXPOSE 8080
ADD target/Starteer-0.0.1-SNAPSHOT.jar Starteer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "Starteer-0.0.1-SNAPSHOT.jar"]
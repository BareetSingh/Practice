FROM openjdk:12-alpine
COPY target/CovidApp-0.0.1-SNAPSHOT.jar CovidApp-0.0.1-SNAPSHOT.jar
CMD java -jar CovidApp-0.0.1-SNAPSHOT.jar



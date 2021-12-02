FROM adoptopenjdk/openjdk11:ubi
MAINTAINER scurto
COPY ./target/profisprint-back-0.0.1-SNAPSHOT.jar service.jar
ENTRYPOINT ["java","-jar","/service.jar"]

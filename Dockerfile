FROM amazoncorretto:17
MAINTAINER EDO
COPY target/empleado-api-0.0.1-SNAPSHOT.jar d.jar
ENTRYPOINT ["java","-jar","/d.jar"]

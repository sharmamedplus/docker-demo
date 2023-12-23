FROM openjdk
LABEL maintainer="Vijay SHarma"
ADD target/docker-demo-0.0.1-SNAPSHOT.jar docker-demo.jar
ENTRYPOINT ["java", "-jar", "docker-demo.jar"]

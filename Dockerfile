FROM openjdk:17
LABEL maintainer="prasad.net"
ADD target/StudentData-0.0.1-SNAPSHOT.jar StudentData.jar
ENTRYPOINT ["java","-jar","StudentData.jar"]
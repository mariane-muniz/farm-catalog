FROM maven:3.5.2-jdk-8-alpine AS MAVEN_TOOL_CHAIN
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package

FROM openjdk:8-jdk
EXPOSE 10001
ENTRYPOINT [ "java", "-jar", "-Xmx64m", "-Xss256k", "catalog.jar" ]

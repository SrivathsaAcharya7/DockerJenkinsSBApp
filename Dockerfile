FROM openjdk:17
EXPOSE 8080
COPY target/DockerJenkinsSB.jar /DJSBApp.jar
ENTRYPOINT ["java", "-jar", "/DJSBApp.jar"]


FROM openjdk:latest
EXPOSE 8089:8003
ADD target/*.jar /app.jar
WORKDIR /app
ENTRYPOINT [ "java", "-jar", "/app.jar" ] 

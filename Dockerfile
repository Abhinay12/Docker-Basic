#jdk image
FROM openjdk:11

# expose port number
EXPOSE 8080

Add target/app.jar  app.jar

ENTRYPOINT ["java","-jar","app.jar"]
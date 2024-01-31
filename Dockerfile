FROM openjdk:8
RUN ./gradlew bootJar --no-daemon
EXPOSE 8080
ADD build/libs/mscloud-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
FROM eclipse-temurin:17

VOLUME /tmp

COPY board-be.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
FROM openjdk:8-alpine

COPY target/uberjar/harkka.jar /harkka/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/harkka/app.jar"]

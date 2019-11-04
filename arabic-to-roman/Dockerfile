FROM openjdk:8-jdk-alpine

EXPOSE 6060

VOLUME /tmp

WORKDIR /arabicToRoman
COPY ./build/libs/arabicToRoman*.jar ./app.jar

ENTRYPOINT ["java","-jar","/arabicToRoman/app.jar"]


FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/WebAppDemo-1.0-SNAPSHOT.war


# cd /usr/local/runme
WORKDIR /usr/local/runme

# cp target/app.jar /usr/local/runme/app.jar
COPY ${JAR_FILE} app.jar

# cp -rf target/lib/  /usr/local/runme/lib


# java -jar /usr/local/runme/app.jar
ENTRYPOINT ["java","-jar","app.jar"]

FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
#ARG BOT_NAME
#ARG BOT_TOKEN
ENV BOT_NAME=test_tutorial_java_telegram_bot
ENV BOT_TOKEN=5410998440:AAHJN2kZy9u4xMzB4N1F1EWa5etRKaWGMR4
ENV BOT_DB_USERNAME=user
ENV BOT_DB_PASSWORD=pass
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-Dspring.datasource.username=${BOT_DB_USERNAME}", "-Dspring.datasource.password=${BOT_DB_PASSWORD}", "-jar", "app.jar"]
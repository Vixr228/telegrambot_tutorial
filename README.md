# telegrambot_tutorial
Writing a telegram bot according to the JavaRush tutorial


## Deployment
Deployment process as easy as possible:
Required software:
- terminal for running bash scripts
- docker
- docker-compose

to deploy application, switch to needed branch and run bash script:

$ bash start.sh ${bot_username} ${bot_token}

That's all.

docker-compose build --build-arg username="my-user" --build-arg password="my-pass"

docker-compose build --build-arg BOT_NAME="test_tutorial_java_telegram_bot" --build-arg BOT_TOKEN="5410998440:AAHJN2kZy9u4xMzB4N1F1EWa5etRKaWGMR4"
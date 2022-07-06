package com.example.telegrambot_tutorial.command;

import static com.example.telegrambot_tutorial.command.StartCommand.START_MESSAGE;
import static com.example.telegrambot_tutorial.command.CommandName.START;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Unit-level testing for StartCommand")
class StartCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return START.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return START_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService);
    }
}

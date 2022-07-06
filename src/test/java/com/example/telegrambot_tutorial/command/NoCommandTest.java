package com.example.telegrambot_tutorial.command;

import org.junit.jupiter.api.DisplayName;

import static com.example.telegrambot_tutorial.command.NoCommand.NO_MESSAGE;
import static com.example.telegrambot_tutorial.command.CommandName.NO;

@DisplayName("Unit-level testing for NoCommand")
public class NoCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return NO.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return NO_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new NoCommand(sendBotMessageService);
    }
}

package com.example.telegrambot_tutorial.command;

import org.junit.jupiter.api.DisplayName;
import static com.example.telegrambot_tutorial.command.StopCommand.STOP_MESSAGE;
import static com.example.telegrambot_tutorial.command.CommandName.STOP;

@DisplayName("Unit-level testing for StopCommand")
public class StopCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return STOP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return STOP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StopCommand(sendBotMessageService);
    }
}

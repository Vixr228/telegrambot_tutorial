package com.example.telegrambot_tutorial.command;
import static com.example.telegrambot_tutorial.command.UnknownCommand.UNKNOWN_MESSAGE;

import com.example.telegrambot_tutorial.command.AbstractCommandTest;
import com.example.telegrambot_tutorial.command.Command;
import com.example.telegrambot_tutorial.command.UnknownCommand;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Unit-level testing for UnknownCommand")
public class UnknownCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return "/fdgdfgdfgdbd";
    }

    @Override
    String getCommandMessage() {
        return UNKNOWN_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new UnknownCommand(sendBotMessageService);
    }
}
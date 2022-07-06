package com.example.telegrambot_tutorial.command;

import org.junit.jupiter.api.DisplayName;
import static com.example.telegrambot_tutorial.command.CommandName.HELP;
import static com.example.telegrambot_tutorial.command.HelpCommand.HELP_MESSAGE;

@DisplayName("Unit-level testing for HelpCommand")
public class HelpCommandTest extends AbstractCommandTest {
    @Override
    Command getCommand() {
        return new HelpCommand(sendBotMessageService);
    }

    @Override
    String getCommandName() {
        return HELP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return HELP_MESSAGE;
    }
}

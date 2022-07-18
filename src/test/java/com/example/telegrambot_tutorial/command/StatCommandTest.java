package com.example.telegrambot_tutorial.command;

import static com.example.telegrambot_tutorial.command.StatCommand.STAT_MESSAGE;
import static com.example.telegrambot_tutorial.command.CommandName.STAT;


public class StatCommandTest extends AbstractCommandTest {
    @Override
    Command getCommand() {
        return new StatCommand(sendBotMessageService, telegramUserService);
    }

    @Override
    String getCommandName() {
        return STAT.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return String.format(STAT_MESSAGE, 0);
    }
}

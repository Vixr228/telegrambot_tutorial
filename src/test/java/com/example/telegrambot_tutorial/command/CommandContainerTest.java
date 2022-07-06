package com.example.telegrambot_tutorial.command;

import com.example.telegrambot_tutorial.command.Command;
import com.example.telegrambot_tutorial.command.CommandContainer;
import com.example.telegrambot_tutorial.command.CommandName;
import com.example.telegrambot_tutorial.command.UnknownCommand;
import com.example.telegrambot_tutorial.service.SendBotMessageService;
import com.example.telegrambot_tutorial.service.SendBotMessageServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.Array;
import java.util.Arrays;

@DisplayName("Unit-level testing for CommandContainer")
public class CommandContainerTest {

    private CommandContainer commandContainer;

    @BeforeEach
    public void init(){
        SendBotMessageService sendBotMessageService = Mockito.mock(SendBotMessageServiceImpl.class);
        commandContainer = new CommandContainer(sendBotMessageService);
    }

    @Test
    public void shouldGetAllTheExistingCommands() {
        //when-then
        Arrays.stream(CommandName.values())
                .forEach(commandName -> {
                    Command command = commandContainer.retrieveCommand(commandName.getCommandName());
                    Assertions.assertNotEquals(UnknownCommand.class, command.getClass());
                });
    }

    @Test
    public void shouldReturnUnknownCommand() {
        //given
        String unknownCommand = "/rar";

        //when
        Command command = commandContainer.retrieveCommand(unknownCommand);
        //then
        Assertions.assertEquals(UnknownCommand.class, command.getClass());
    }

}

package com.example.telegrambot_tutorial.command;

public enum CommandName {
    START("/start"),
    HELP("/help"),
    NO("nocommand"),
    STAT("/stat"),
    STOP("/stop");

    private final String commandName;

    CommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName(){
        return commandName;
    }
}

package com.example.telegrambot_tutorial.command;

import com.example.telegrambot_tutorial.service.SendBotMessageService;
import com.example.telegrambot_tutorial.service.TelegramUserService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StatCommand implements Command{

    private final TelegramUserService telegramUserService;
    private final SendBotMessageService sendBotMessageService;

    public final static String STAT_MESSAGE = "Telegram Bot использует %s человек.";

    public StatCommand(SendBotMessageService sendBotMessageService, TelegramUserService telegramUserService) {
        this.telegramUserService = telegramUserService;
        this.sendBotMessageService = sendBotMessageService;
    }


    @Override
    public void execute(Update update) {
        int activeUser = telegramUserService.retrieveAllActiveUsers().size();
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), String.format(STAT_MESSAGE, activeUser));

    }
}

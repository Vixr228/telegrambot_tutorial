package com.example.telegrambot_tutorial.command;

import com.example.telegrambot_tutorial.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StopCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    public final static String STOP_MESSAGE = "Деактивировал все ваши подписки \uD83D\uDE1F.";


    // Здесь не добавляем сервис через получение из Application Context.
    // Потому что если это сделать так, то будет циклическая зависимость, которая
    // ломает работу приложения.
    public StopCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), STOP_MESSAGE);
    }
}

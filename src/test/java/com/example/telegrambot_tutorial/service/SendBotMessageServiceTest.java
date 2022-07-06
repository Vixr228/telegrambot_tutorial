package com.example.telegrambot_tutorial.service;

import com.example.telegrambot_tutorial.bot.TelegramBot;
import com.example.telegrambot_tutorial.service.SendBotMessageService;
import com.example.telegrambot_tutorial.service.SendBotMessageServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@DisplayName("Unit-level testing for SendBotMessageService")
public class SendBotMessageServiceTest {

    TelegramBot telegramBot;
    SendBotMessageService sendBotMessageService;

    @BeforeEach
    public void init(){
        telegramBot = Mockito.mock(TelegramBot.class);
        sendBotMessageService = new SendBotMessageServiceImpl(telegramBot);
    }

    @Test
    public void shouldSendMessage() throws TelegramApiException {
        //given
        String chat_id = "chat_id";
        String message = "message";

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chat_id);
        sendMessage.setText(message);
        sendMessage.enableHtml(true);

        //when
        sendBotMessageService.sendMessage(chat_id, message);

        //then
        Mockito.verify(telegramBot).execute(sendMessage);

    }

}

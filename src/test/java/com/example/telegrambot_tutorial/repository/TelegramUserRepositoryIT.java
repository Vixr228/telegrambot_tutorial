package com.example.telegrambot_tutorial.repository;

import com.example.telegrambot_tutorial.repository.entity.TelegramUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;
import java.util.Optional;

@ActiveProfiles("test")
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public class TelegramUserRepositoryIT {

    @Autowired
    private TelegramUserRepository telegramUserRepository;


    @Sql(scripts = {"/sql/clearDbs.sql", "/sql/telegram_users.sql"})
    @Test
    public void shouldFindAllActiveUsers(){
        List<TelegramUser> users = telegramUserRepository.findAllByActiveTrue();

        Assertions.assertEquals(5, users.size());
    }

    @Sql(scripts = {"/sql/clearDbs.sql"})
    @Test
    public void shouldProperlySaveTelegramUser(){
        TelegramUser user = new TelegramUser();
        user.setChatId("1234567890");
        user.setActive(false);
        telegramUserRepository.save(user);

        Optional<TelegramUser> saved = telegramUserRepository.findById(user.getChatId());

        Assertions.assertTrue(saved.isPresent());
        Assertions.assertEquals(user, saved.get());
    }

}

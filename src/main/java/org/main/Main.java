package org.main;

import org.main.tempmailbot.BotProperties;
import org.main.tempmailbot.TempEmailBot;
import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication;

public class Main {
    public static void main(String[] args) {

        try {
            TelegramBotsLongPollingApplication telegramBotsLongPollingApplication = new TelegramBotsLongPollingApplication();

            telegramBotsLongPollingApplication.registerBot(BotProperties.getBotToken(),new TempEmailBot(BotProperties.getBotUsername()));


        }catch (Exception e){
            e.printStackTrace();
        }




    }
}
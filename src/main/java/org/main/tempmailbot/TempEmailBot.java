package org.main.tempmailbot;

import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication;
import org.telegram.telegrambots.longpolling.interfaces.LongPollingUpdateConsumer;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

public class TempEmailBot implements LongPollingUpdateConsumer {


    private final String botUsername;
//    private final TelegramBotsLongPollingApplication telegramBotsLongPollingApplication;

    public TempEmailBot(String botUsername){
        this.botUsername = botUsername;
    }

    @Override
    public void consume(List<Update> list) {
    }

    private void handleUpdate(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {
            String message = update.getMessage().getText();
            long messageId = update.getMessage().getMessageId();

            if("/start".equals(message)){
                String msgRes = "Ciao questo è un bot delle scimmie";


            }


        }



    }


    private void sendMessage(String chatID,String message){
        SendMessage sendMessage = new SendMessage(chatID,message);
        sendMessage.enableMarkdown(true);

        try {


        }catch (Exception e){
            e.printStackTrace();
        }

    }


}

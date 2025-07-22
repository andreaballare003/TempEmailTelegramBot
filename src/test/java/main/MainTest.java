package main;


import org.junit.Test;
import org.main.tempmailbot.BotProperties;

public class MainTest {
    @Test
    public void main(){

        BotProperties botProperties = new BotProperties();

        System.out.println(botProperties.getBotToken());
        System.out.println(botProperties.getBotUsername());



    }

}

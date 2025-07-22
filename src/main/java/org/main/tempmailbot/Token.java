package org.main.tempmailbot;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Token {

    private static String propertyBotTokenName="bot_token";
    private static String filePath ="config/bot_token";

    public static String getBotToken(){
        Properties prop = loadProperties();
        return prop.getProperty(propertyBotTokenName);
    }

    private static Properties loadProperties() {
        Properties p = new Properties();
        try (FileInputStream fis = new FileInputStream(filePath)) {
            p.load(fis);
        }catch(IOException e) {
            System.err.println("Errore nella lettura dei parametri: "+e.getMessage());
            e.printStackTrace();

        }
        return p;
    }




}

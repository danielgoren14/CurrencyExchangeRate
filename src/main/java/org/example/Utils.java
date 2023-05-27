package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Utils {
    public final static String SITE_URL = "https://il.investing.com/currencies/";
    public final static String USD_EUR= "USD/EUR";
    public final static String GBP_USD= "GBP/USD";
    public final static String USD_JPY= "USD/JPY";
    public final static String USD_ILS= "USD/ILS";
    public final static String EUR_ILS= "EUR/ILS";
    public static final Map<String , String> currency = new HashMap<>(){{
        put(USD_EUR ,"pair_1");
        put(GBP_USD , "pair_2");
        put(USD_JPY , "pair_3");
        put(USD_ILS , "pair_63");
        put(EUR_ILS , "pair_64");
    }
    };

    public static void sleep (int seconds){
        try {
            Thread.sleep(seconds*100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addButton(JPanel panel , JButton currentButton) {
        currentButton.setVisible(true);
        currentButton.setEnabled(true);
        currentButton.setHorizontalTextPosition(JButton.CENTER);
        currentButton.setVerticalTextPosition(JButton.CENTER);
        currentButton.setContentAreaFilled(true);
        currentButton.setBackground(Color.WHITE);
        panel.add(currentButton);
    }


}
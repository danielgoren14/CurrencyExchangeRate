package org.example;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private static final int BUTTON_WIDTH = 100;
    private static final int BUTTON_HEIGHT = 30;
    private static final int BUTTON_X = 225;
    private static final int INITIAL_BUTTON_Y = 50;
    private static final int MARGIN_FROM_BUTTON = 50;

    private JButton usdEur;
    private JButton gbpUsd;
    private JButton usdJpy;
    private JButton usdIls;
    private JButton eurIls;

    public MainPanel() {
        this.setBounds(0, 0, Window.WIDTH, Window.HEIGHT);
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(Color.gray);

        this.usdEur = new JButton(Utils.USD_EUR);
        this.usdEur.setBounds(BUTTON_X, INITIAL_BUTTON_Y, BUTTON_WIDTH, BUTTON_HEIGHT);
        Utils.addButton(this, usdEur);

        this.gbpUsd = new JButton(Utils.GBP_USD);
        this.gbpUsd.setBounds(BUTTON_X, INITIAL_BUTTON_Y + MARGIN_FROM_BUTTON, BUTTON_WIDTH, BUTTON_HEIGHT);
        Utils.addButton(this, gbpUsd);

        this.usdJpy = new JButton(Utils.USD_JPY);
        this.usdJpy.setBounds(BUTTON_X, INITIAL_BUTTON_Y + 2 * MARGIN_FROM_BUTTON, BUTTON_WIDTH, BUTTON_HEIGHT);
        Utils.addButton(this, usdJpy);

        this.usdIls = new JButton(Utils.USD_ILS);
        this.usdIls.setBounds(BUTTON_X, INITIAL_BUTTON_Y + 3 * MARGIN_FROM_BUTTON, BUTTON_WIDTH, BUTTON_HEIGHT);
        Utils.addButton(this, usdIls);

        this.eurIls = new JButton(Utils.EUR_ILS);
        this.eurIls.setBounds(BUTTON_X, INITIAL_BUTTON_Y + 4 * MARGIN_FROM_BUTTON, BUTTON_WIDTH, BUTTON_HEIGHT);
        Utils.addButton(this, eurIls);


        this.eurIls.addActionListener((event) -> {
            DisplayPanel.setUserChoice(Utils.EUR_ILS);
            Window.changePanel(Window.subMenu, this);
            DisplayPanel.addNecessaryData();
        });

        this.usdJpy.addActionListener((event) -> {
            DisplayPanel.setUserChoice(Utils.USD_JPY);
            Window.changePanel(Window.subMenu, this);
            DisplayPanel.addNecessaryData();
        });

        this.usdIls.addActionListener((event) -> {
            DisplayPanel.setUserChoice(Utils.USD_ILS);
            Window.changePanel(Window.subMenu, this);;
            DisplayPanel.addNecessaryData();
        });

        this.gbpUsd.addActionListener((event) -> {
            DisplayPanel.setUserChoice(Utils.GBP_USD);
            Window.changePanel(Window.subMenu, this);
            DisplayPanel.addNecessaryData();
        });

        this.usdEur.addActionListener((event) -> {
            DisplayPanel.setUserChoice(Utils.USD_EUR);
            Window.changePanel(Window.subMenu, this);
            DisplayPanel.addNecessaryData();
        });
    }

}
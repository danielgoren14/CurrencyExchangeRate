package org.example;

import javax.swing.*;

public class Window extends JFrame {

    final static int WIDTH = 550;
    final static int HEIGHT = 700;
    public static JPanel mainMenu = new MainPanel();
    public static JPanel subMenu = new DisplayPanel() ;
    public Window() {
        this.setTitle("currency exchange");
        this.setIconImage(new ImageIcon("src/main/java/org/example/Assets/Icon.png").getImage());
        this.getContentPane().add(mainMenu);
        this.getContentPane().add(subMenu);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(WIDTH, HEIGHT);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }

    public static void changePanel(JPanel newPanel, JPanel oldPanel) {
        newPanel.setVisible(true);
        if (oldPanel!=null){
            oldPanel.setVisible(false);
        }
    }
}
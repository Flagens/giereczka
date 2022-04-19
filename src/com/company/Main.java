package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("I20");

        gamePanel gamePanel = new gamePanel();
        window.add(gamePanel);

        window.pack(); // window is sized to fit the preffered size and layout of gamePanel


        window.setLocationRelativeTo(null); //okno bedzie na srodku ekranu
        window.setVisible(true);

        gamePanel.startGameThread();
    }
}

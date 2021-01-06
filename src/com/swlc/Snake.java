package com.swlc;

import javax.swing.*;

public class Snake extends JFrame {

    public Snake() {

        initUI();
    }

    private void initUI() {

        add(new GameBoard());

        setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

package com.swlc;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame frame = new Snake();
            frame.setTitle("Snake Game");
            frame.setBackground(Color.black);
            frame.setVisible(true);
        });
    }
}

package com.swlc.test;

import com.swlc.GameBoard;
import com.swlc.GameBoard.TAdapter;
import org.junit.Test;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;


public class SnakeTest {


    @Test
    public void initGame(){
        GameBoard gameBoard = new GameBoard();
        gameBoard.initBoard();
    }

    @Test
    public void imageLoadTest(){
        GameBoard gameBoard = new GameBoard();
        gameBoard.loadImages();
    }

    @Test
    public void keyAdepterTest() {
        KeyEvent e = null;
        e.setKeyCode(1);
        TAdapter tAdapter = new TAdapter();
        tAdapter.keyPressed(e);
    }

    @Test
    public void locateApple(){
        GameBoard gameBoard = new GameBoard();
        gameBoard.locateApple();
    }
}

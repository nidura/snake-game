package com.swlc.test;

import com.swlc.GameBoardController;
import com.swlc.GameBoardController.TAdapter;
import org.junit.Test;

import java.awt.event.KeyEvent;


public class SnakeTest {


    @Test
    public void initGame(){
        GameBoardController gameBoard = new GameBoardController();
        gameBoard.initBoard();
    }

    @Test
    public void imageLoadTest(){
        GameBoardController gameBoard = new GameBoardController();
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
        GameBoardController gameBoard = new GameBoardController();
        gameBoard.locateApple();
    }
}

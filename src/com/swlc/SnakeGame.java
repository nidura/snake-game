package com.swlc;

import com.swlc.Impl.DbImpl;
import com.swlc.dto.Score;

import java.sql.SQLException;

public class SnakeGame {

    private  DbImpl db;

    public int saveScore(Score score) throws SQLException {
        return db.saveScore(score);
    }

    public int startNewGame(Score score) throws SQLException{
        return db.saveScore(score);
    }
}

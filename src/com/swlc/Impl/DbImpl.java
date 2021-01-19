package com.swlc.Impl;

import com.swlc.db.DatabaseConnection;
import com.swlc.dto.Score;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbImpl {

    static Connection con
            = DatabaseConnection.getConnection();

    public int saveScore(Score score)
            throws SQLException
    {

        String query
                = "insert into Score(user_id, "
                + "score) VALUES (?, ?)";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setString(1, score.getUserId());
        ps.setString(2, score.getScore());
        int n = ps.executeUpdate();
        return n;
    }


}

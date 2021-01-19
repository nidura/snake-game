package com.swlc.dto;

import java.time.LocalDateTime;

public class Score {
    private int id;
    private String userId;
    private String score;
    private LocalDateTime dateTime;

    public Score(int id, String userId, String score, LocalDateTime dateTime) {
        this.id = id;
        this.userId = userId;
        this.score = score;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public Score setId(int id) {
        this.id = id;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public Score setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getScore() {
        return score;
    }

    public Score setScore(String score) {
        this.score = score;
        return this;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Score setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }
}

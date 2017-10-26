package edu.calbaptist.android.dontopenthedoorgame;

/**
 * Created by lynnreilly on 10/25/17.
 */

public class Player {
    private long id;
    private String player;
    private double score;

    public Player() {
    }

    public Player (long id, String player, double score) {
        this.id = id;
        this.player = player;
        this.score = score;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

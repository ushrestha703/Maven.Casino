package io.zipcoder.casino.player;

public interface GamblingPlayer {
    Player getPlayerData();
    Integer getRanking();
    Integer getNumberOfWins();
    Integer getFund();
    void addFund(int newFund);

}

package ru.hse.blackjack.core;

public interface BlackJackPlayer {
    Card more();
    int getScore();
    PlayerType getPlayerType();

    enum PlayerType {
        BOT, HUMAN
    }
}

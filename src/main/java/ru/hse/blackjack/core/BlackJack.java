package ru.hse.blackjack.core;

public class BlackJack {
    public Card more() {
        return null;
    }

    public GameState getGameState() {
        return null;
    }

    public boolean check() {
        return true;
    }

    public enum GameState {
        RUNNING, BOT_WON, HUMAN_WON
    }

}

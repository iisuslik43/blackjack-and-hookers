package ru.hse.blackjack.core;

public class BlackJackBot implements BlackJackPlayer {
    public BlackJackBot(Deck deck) {
    }

    @Override
    public Card more() {
        return null;
    }

    @Override
    public int getScore() {
        return 0;
    }

    @Override
    public boolean check() {
        return false;
    }
}

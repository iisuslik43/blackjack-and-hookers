package ru.hse.blackjack.core;

public class BlackJackRealPlayer implements BlackJackPlayer {
    private final Deck deck;

    public BlackJackRealPlayer(Deck deck) {
        this.deck = deck;
    }

    @Override
    public Card more() {
        return deck.getCard();
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

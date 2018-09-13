package ru.hse.blackjack.core;

public class BlackJack {
    private final Deck deck = Deck.getShuffledDeck();
    private final BlackJackPlayer firstPlayer = new BlackJackRealPlayer(deck);
    private final BlackJackPlayer secondPlayer = new BlackJackBot(deck);

    public Card more() {
        return firstPlayer.more();
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

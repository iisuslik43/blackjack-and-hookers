package ru.hse.blackjack.core;

public class BlackJack {
    private final Deck deck = Deck.getShuffledDeck();
    private final BlackJackPlayer firstPlayer = new BlackJackRealPlayer(deck);
    private final BlackJackPlayer secondPlayer = new BlackJackBot(deck);
    private int currentPlayer = 0;

    public Card more() {
        Card card = firstPlayer.more();
        //secondPlayer.takeTurn();
        return card;
    }

    public GameState getGameState() {
        return null;
    }

    public enum GameState {
        RUNNING, BOT_WON, HUMAN_WON
    }

}

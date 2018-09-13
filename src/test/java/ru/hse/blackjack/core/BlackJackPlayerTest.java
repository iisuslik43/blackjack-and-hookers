package ru.hse.blackjack.core;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BlackJackPlayerTest {

    @Test(expected = EmptyDeckException.class)
    public void moreEmptyDeck() throws Exception {
        Deck deck = new Deck();
        for (int i = 0; i < 52; i++) {
            deck.getCard();
        }
        BlackJackPlayer blackJackPlayer = new BlackJackBot(deck);
        blackJackPlayer.more();
    }

    @Test
    public void moreChangeScore() throws Exception {
        BlackJackPlayer blackJackPlayer = new BlackJackBot(new Deck());
        assertTrue(blackJackPlayer.getScore() == 0);
        blackJackPlayer.more();
        assertTrue(blackJackPlayer.getScore() > 0);
    }

    @Test(expected = AfterCheckedException.class)
    public void moreWhenChecked() throws Exception {
        BlackJackPlayer blackJackPlayer = new BlackJackBot(new Deck());
        blackJackPlayer.check();
        blackJackPlayer.more();
    }

    @Test
    public void getScoreInitial() throws Exception {
        BlackJackPlayer blackJackPlayer = new BlackJackBot(new Deck());
        assertTrue(blackJackPlayer.getScore() == 0);
    }

}
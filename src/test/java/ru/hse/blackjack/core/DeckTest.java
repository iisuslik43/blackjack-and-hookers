package ru.hse.blackjack.core;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DeckTest {
    @Test
    public void getCard() throws Exception {
        assertTrue(new Deck().getCard().getScores().length > 0);
    }

    @Test
    public void getShuffledDeck() throws Exception {
        assertTrue(Deck.getShuffledDeck().getCard().getScores().length > 0);
    }

}
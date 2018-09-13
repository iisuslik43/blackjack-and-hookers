package ru.hse.blackjack.core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BlackJackTest {

    @Test(expected = GameOverException.class)
    public void moreWhenFinished() throws Exception {
        BlackJack blackJack = new BlackJack();
        for (int i = 0; i <= 52; i++) {
            blackJack.more();
        }

    }

    @Test
    public void moreJustFinished() throws Exception {
        BlackJack blackJack = new BlackJack();
        for (int i = 0; i < 52; i++) {
            blackJack.more();
        }

    }

    @Test
    public void moreFirstTime() throws Exception {
        BlackJack blackJack = new BlackJack();
        Card card = blackJack.more();
        assertTrue(card.getScores().length > 0);
    }

    @Test
    public void moreSeveralTimes() throws Exception {
        BlackJack blackJack = new BlackJack();
        for (int i = 0; i < 5; i++) {
            Card card = blackJack.more();
            assertTrue(card.getScores().length > 0);
        }
    }

    @Test
    public void getGameStateBotWon() throws Exception {
        BlackJack blackJack = new BlackJack();
        blackJack.check();
        assertEquals(BlackJack.GameState.BOT_WON, blackJack.getGameState());
    }

}
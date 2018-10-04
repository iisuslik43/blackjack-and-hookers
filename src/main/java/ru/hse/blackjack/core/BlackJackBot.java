package ru.hse.blackjack.core;

import java.util.HashSet;
import java.util.Set;

public class BlackJackBot implements BlackJackPlayer {
    private final Deck deck;
    private final Set<Integer> availableScores = new HashSet<>();

    public BlackJackBot(Deck deck) {
        this.deck = deck;
    }

    @Override
    public Card more() {
        Card gotCard = deck.getCard();
        if (availableScores.size() == 0) {
            availableScores.addAll(gotCard.getScores());
        } else {
            for (Integer score : availableScores) {
                for (Integer cardScore : gotCard.getScores()) {
                    score += cardScore;
                }
            }
        }
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

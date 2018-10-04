package ru.hse.blackjack.core;

import java.util.List;

public class Card {
    private final List<Integer> score;

    public Card(List<Integer> score) {
        this.score = score;
    }

    public List<Integer> getScores() {
        return score;
    }

}

package ru.hse.blackjack.core;

public class Card {
    private final int[] score;

    public Card(int[] score) {
        this.score = score;
    }

    public int[] getScores() {
        return score;
    }

}

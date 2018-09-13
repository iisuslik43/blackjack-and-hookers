package ru.hse.blackjack.core;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private final List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (int score = 2; score < 10; score++) {
            for (int i = 0; i < 4; i++)
                cards.add(new Card(new int[]{score}));
        }

        for (int i = 0; i < 12; i++)
            cards.add(new Card(new int[]{10}));

        for (int i = 0; i < 4; i++) {
            cards.add(new Card(new int[]{1, 11}));
        }
    }

    public Card getCard() {
        return null;
    }


    public static Deck getShuffledDeck() {
        Deck deck = new Deck();
        return null;
    }
}

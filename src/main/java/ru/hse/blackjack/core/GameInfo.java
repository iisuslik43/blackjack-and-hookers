package ru.hse.blackjack.core;

import java.util.ArrayList;

public interface GameInfo {
    ArrayList<Card> getCardsOfMine();

    ArrayList<Card> getCardsOfRival();

    BlackJack.GameState getGameSate();

    boolean isMyTurn();
}

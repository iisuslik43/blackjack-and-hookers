package ru.hse.blackjack.controller;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import ru.hse.blackjack.core.BlackJack;
import ru.hse.blackjack.core.Card;

public class Controller {
    public Button takeCard;
    public ListView cards;
    public TextField text;

    private static BlackJack blackJack;

    public void setBlackJack(BlackJack blackJack) {
        Controller.blackJack = blackJack;
    }

    public void onCardRequest() {
        state = blackJack.getGameState();

        state.card();
        state.

    }
}

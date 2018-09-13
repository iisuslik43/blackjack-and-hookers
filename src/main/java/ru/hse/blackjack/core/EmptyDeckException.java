package ru.hse.blackjack.core;

public class EmptyDeckException extends Exception {
    public EmptyDeckException(){
        super("Tried to get card from empty deck.");
    }
}

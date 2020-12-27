package net.lesson14.exercise1;

public class GoldCardCreator implements CardFactory {
    @Override
    public Card createCard() {
        return new GoldCard();
    }
}

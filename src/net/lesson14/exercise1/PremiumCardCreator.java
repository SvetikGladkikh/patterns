package net.lesson14.exercise1;

public class PremiumCardCreator implements CardFactory {
    @Override
    public Card createCard() {
        return new PremiumCard();
    }
}

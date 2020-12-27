package net.lesson14.exercise1;

import static net.lesson14.exercise1.CardTypes.GOLD;
import static net.lesson14.exercise1.CardTypes.PREMIUM;

public class Creator {
    public static void main(String[] args) {
        CardFactory cardFactory1 = createCardByName(GOLD);
        Card card1  = cardFactory1.createCard();
        CardFactory cardFactory2 = createCardByName(PREMIUM);
        Card card2  = cardFactory2.createCard();

        card1.writeInfo();
        card2.writeInfo();

        CardFactory cardFactory3 = createCardByName(null);

    }

    static CardFactory createCardByName(CardTypes cardType) {
        switch (cardType) {
            case GOLD:
                return new GoldCardCreator();
            case PREMIUM:
                return new PremiumCardCreator();
            default:
                throw new RuntimeException("Unknown card name.");
        }
    }
}

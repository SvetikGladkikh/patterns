package net.lesson14.exercise1;

import java.math.BigDecimal;

public class PremiumCard implements Card {
    final BigDecimal limit = BigDecimal.valueOf(3000000);
    final Double interestRate = 21.9;
    final BigDecimal serviceCost = BigDecimal.valueOf(2450);

    @Override
    public void writeInfo() {
        System.out.println("Premium Card.\n Limit " + limit + ", InterestRate " + interestRate + "%, Service cost " + serviceCost + ".");
    }
}

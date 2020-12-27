package net.lesson14.exercise1;

import java.math.BigDecimal;

public class GoldCard implements Card {
    final BigDecimal limit = BigDecimal.valueOf(600000);
    final Double interestRate = 23.9;
    final BigDecimal serviceCost = BigDecimal.valueOf(0);

    @Override
    public void writeInfo() {
        System.out.println("Gold Card.\n Limit " + limit + ", InterestRate " + interestRate + "%, Service cost " + serviceCost + ".");
    }
}

package net.lesson14.exercise2;

import java.math.BigDecimal;

public class Client {
    private String name;
    private BigDecimal income;

    public Client(String name, BigDecimal income) {
        this.name = name;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getIncome() {
        return income;
    }
}

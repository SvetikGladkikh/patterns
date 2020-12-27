package net.lesson14.exercise2;

import java.math.BigDecimal;

public class CreditTerms {
    private double interestRate;
    private int duration;
    private BigDecimal monthlyPayment;

    public CreditTerms() {
    }

    public CreditTerms(double interestRate, int duration, BigDecimal monthlyPayment) {
        this.interestRate = interestRate;
        this.duration = duration;
        this.monthlyPayment = monthlyPayment;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setMonthlyPayment(BigDecimal monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getDuration() {
        return duration;
    }

    public BigDecimal getMonthlyPayment() {
        return this.monthlyPayment;
    }
}

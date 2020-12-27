package net.lesson14.exercise2;

import java.math.BigDecimal;

public class CreditTermsBuilder {
    private CreditTerms creditTerms;

    public CreditTermsBuilder createCreditTerms() {
        creditTerms = new CreditTerms();
        return this;
    }

    public CreditTermsBuilder withDuration(int duration) {
        creditTerms.setDuration(duration);
        return this;
    }

    public CreditTermsBuilder withInterestRate(double interestRate){
        creditTerms.setInterestRate(interestRate);
        return this;
    }

    public CreditTermsBuilder withMonthlyPayment(BigDecimal monthlyPayment){
        creditTerms.setMonthlyPayment(monthlyPayment);
        return this;
    }

    public CreditTerms build(){
        return creditTerms;
    }

}

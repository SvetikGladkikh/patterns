package net.lesson14.exercise2;

public class HandlerCheckRequest extends Handler {

    @Override
    public boolean check(Request request) {
        System.out.println("Check request");

        if (request.getClientInfo().getName().length() > 0
                && request.getCreditTerms().getDuration()> 0
                && request.getCreditTerms().getInterestRate() > 0
                && request.getCreditTerms().getMonthlyPayment().longValueExact() > 0)
            return true;
        else
            return false;
    }
}

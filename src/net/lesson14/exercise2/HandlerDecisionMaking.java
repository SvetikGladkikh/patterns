package net.lesson14.exercise2;

public class HandlerDecisionMaking extends Handler {

    @Override
    public boolean check(Request request) {
        System.out.println("Decision making");

        if (request.getClientInfo().getIncome().longValueExact() > request.getCreditTerms().getMonthlyPayment().longValueExact())
            return true;
        else
            return false;
    }
}

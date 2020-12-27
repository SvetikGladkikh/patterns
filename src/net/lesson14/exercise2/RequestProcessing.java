package net.lesson14.exercise2;

import java.math.BigDecimal;

public class RequestProcessing {
    public static void main(String[] args) {
        Client client = new Client("Vasya", BigDecimal.valueOf(1000));

        // Constructor
//        CreditTerms creditTerms = new CreditTerms(21.5, 12, BigDecimal.valueOf(500));

        // Builder
        CreditTerms creditTerms = new CreditTermsBuilder()
                .createCreditTerms()
                .withDuration(12)
                .withInterestRate(21.5)
                .withMonthlyPayment(BigDecimal.valueOf(500))
                .build();

        Request request = new Request(client, creditTerms);

        Handler checkRequest = new HandlerCheckRequest();
        Handler checkCompliance = new HandlerCheckCompliance();
        Handler decisionMaking = new HandlerDecisionMaking();

        checkRequest.setNextHandler(checkCompliance);
        checkCompliance.setNextHandler(decisionMaking);

        checkRequest.handle(request);
    }
}

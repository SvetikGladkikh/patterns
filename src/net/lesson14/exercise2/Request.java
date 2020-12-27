package net.lesson14.exercise2;

public class Request {
    private Client clientInfo;
    private CreditTerms creditTerms;

    public Request(Client clientInfo, CreditTerms creditTerms) {
        this.clientInfo = clientInfo;
        this.creditTerms = creditTerms;
    }

    public Client getClientInfo() {
        return clientInfo;
    }

    public CreditTerms getCreditTerms() {
        return creditTerms;
    }
}

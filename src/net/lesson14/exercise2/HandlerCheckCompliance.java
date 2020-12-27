package net.lesson14.exercise2;

public class HandlerCheckCompliance extends Handler {

    @Override
    public boolean check(Request request) {
        System.out.println("Check compliance");

        if (request.getClientInfo().getName().equalsIgnoreCase("zuhra"))
            return false;
        else
            return true;
    }
}

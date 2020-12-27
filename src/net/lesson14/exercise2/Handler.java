package net.lesson14.exercise2;

public abstract class Handler {
    private Handler nextHandler;

    public final void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final void handle(Request request) {
        if (check(request)) {
            if (nextHandler != null) {
                nextHandler.handle(request);
            } else {
                System.out.println("Request is ok.");
            }
        } else {
            System.out.println("Invalid request");
        }
    }

    public abstract boolean check(Request request);
}

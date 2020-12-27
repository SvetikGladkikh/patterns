package net.lesson14.exercise4;

public class AuditService {
    public static void sendEvent(String text) {
        System.out.println("Audit Service get event: " + text);
    }
}

package net.lesson14.exercise3;

public class NotifyService {

    public static void sendSMS(Client client, String text) {
        System.out.println("Sending SMS to " + client.getName() + " with text: " + text);
    }

    public static void sendMail(Client client, String text) {
        System.out.println("Sending eMail to " + client.getName() + " with text: " + text);
    }
}

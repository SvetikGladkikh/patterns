package net.lesson14.exercise3;

public class Notifier {
    private Command email;
    private Command SMS;
    private Command emailSMS;

    public Notifier(Command email, Command SMS, Command emailSMS) {
        this.email = email;
        this.SMS = SMS;
        this.emailSMS = emailSMS;
    }

    public void sendSMS() {
        this.SMS.execute();
    }

    public void sendEmail() {
        this.email.execute();
    }

    public void sendEmailSMS() {
        this.emailSMS.execute();
    }
}

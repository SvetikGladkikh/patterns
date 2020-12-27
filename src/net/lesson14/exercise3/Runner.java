package net.lesson14.exercise3;

public class Runner {
    public static void main(String[] args) {
        Form form = new Form("file:///form.pdf", "form1");
        Client client = new Client("user1");
        Notifier notifier = new Notifier(
                new CommandEmail(form, client),
                new CommandSMS(form, client),
                new CommandSMSeMail(form, client));

        notifier.sendSMS();
        System.out.println("---------------");
        notifier.sendEmail();
        System.out.println("---------------");
        notifier.sendEmailSMS();
    }
}

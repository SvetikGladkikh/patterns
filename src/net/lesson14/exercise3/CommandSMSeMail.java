package net.lesson14.exercise3;

public class CommandSMSeMail implements Command {
    private Form form;
    private Client client;

    public CommandSMSeMail(Form form, Client client) {
        this.form = form;
        this.client = client;
    }

    @Override
    public void execute() {
        NotifyService.sendSMS(client, "Download form from " + this.form.getUrl());
        NotifyService.sendMail(client,"Read form: " + this.form.getContent());
        NotifyService.sendSMS(client, "Email has been sent ");
    }
}
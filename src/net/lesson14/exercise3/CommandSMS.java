package net.lesson14.exercise3;

public class CommandSMS implements Command {
    private Form form;
    private Client client;

    public CommandSMS(Form form, Client client) {
        this.form = form;
        this.client = client;
    }

    @Override
    public void execute() {
       NotifyService.sendSMS(client, "Download form from " + this.form.getUrl());
    }
}

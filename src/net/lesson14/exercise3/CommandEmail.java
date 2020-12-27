package net.lesson14.exercise3;

public class CommandEmail implements Command {
    private Form form;
    private Client client;

    public CommandEmail(Form form, Client client) {
        this.form = form;
        this.client = client;
    }

    @Override
    public void execute() {
        NotifyService.sendMail(client, "Read form: " + this.form.getContent());
        NotifyService.sendSMS(client, "Email has been sent");
    }
}

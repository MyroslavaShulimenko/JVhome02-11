public class Sender {
    protected MailDeliveryService maile;

    public Sender(MailDeliveryService maile) {
        this.maile = maile;
    }
    public void sendingMaile(){

    maile.sendMail();
}
    }

// так и не поняла зачем этот класс создала...
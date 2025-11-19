package challenge8;

public class PushNotification extends Notification{
    @Override
    public void envoyer(String message) {
        System.out.println("PushNotification, message : "+message);
    }
}

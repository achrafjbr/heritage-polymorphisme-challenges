package challenge8;

import java.util.List;

public class Notify {

    public void notifierTous(List<Notification> liste, String msg){
        for (Notification notification: liste){
            notification.envoyer(msg);
        }
    }
}

package factory._1_simple;

/**
 * Created by twer on 3/22/15.
 */
public class SenderFactory {
    public Sender produce(String senderName) {
        if (senderName.equals("email")) {
            return new EmailSender();
        } else if (senderName.equals("sms")) {
            return new SmsSender();
        }

        return null;
    }
}

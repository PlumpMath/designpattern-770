package factory._3_static;

/**
 * Created by twer on 3/22/15.
 */
public class SenderFactory {
//    public Sender produce(String senderName) {
//        if (senderName.equals("email")) {
//            return new EmailSender();
//        } else if (senderName.equals("sms")) {
//            return new SmsSender();
//        }
//
//        return null;
//    }

    public static Sender produceEmail() {
        return new EmailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}

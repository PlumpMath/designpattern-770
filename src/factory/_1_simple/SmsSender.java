package factory._1_simple;

/**
 * Created by twer on 3/22/15.
 */
public class SmsSender implements Sender {
    public void send() {
        System.out.println("sending sms...");
    }
}

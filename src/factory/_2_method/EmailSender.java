package factory._2_method;

/**
 * Created by twer on 3/22/15.
 */
public class EmailSender implements Sender {
    @Override
    public void send() {
        System.out.println("sending email...");
    }
}

package factory._4_abstract;

/**
 * Created by twer on 3/22/15.
 */
public class EmailSenderFactory implements Provider {

    @Override
    public Sender produce() {
        return new EmailSender();
    }
}

package factory._1_simple;

/**
 * Created by twer on 3/22/15.
 */
public class Main {
    public static void main(String[] args) {
//        EmailSender emailSender = new EmailSender();
//        emailSender.send();
//
//        SmsSender smsSender = new SmsSender();
//        smsSender.send();

        SenderFactory senderFactory = new SenderFactory();
        Sender emailSender = senderFactory.produce("email");
        emailSender.send();
    }
}

/*
* 这种方式的问题：需要自己初始化不同的sender，要关注具体的初始化过程
* 解决问题思路：有没有一个东西可以帮助我们初始化，我们只需要知道一个东西，统一调用
* */

/*
* 这种方式的问题：如果传递字符串出错，则不能正确创建对象
* 解决问题思路：多个工厂方法，分别创建对象
* */

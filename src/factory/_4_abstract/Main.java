package factory._4_abstract;

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

//        SenderFactory senderFactory = new SenderFactory();
//        Sender emailSender = senderFactory.produce("email");
//        emailSender.send();

//        Sender emailSender = SenderFactory.produceEmail();
//        emailSender.send();
//
//        Sender smsSender = SenderFactory.produceSms();
//        smsSender.send();

        Provider emailSenderProvider = new EmailSenderFactory();
        Sender emailSender = emailSenderProvider.produce();
        emailSender.send();

        Provider smsSenderProvider = new SmsSenderFactory();
        Sender smsSender = smsSenderProvider.produce();
        smsSender.send();
    }
}

/* 不使用工厂，普通的接口实现
* 这种方式的问题：需要自己初始化不同的sender，要关注具体的初始化过程
* 解决问题思路：有没有一个东西可以帮助我们初始化，我们只需要知道一个东西，统一调用
* */

/* 简单工厂模式
* 这种方式的问题：如果传递字符串出错，则不能正确创建对象，而且创建过程会有多个if else
* 解决问题思路：多个工厂方法，分别创建对象
* */

/* 工厂方法模式
* 这种方式的问题：还需要初始化factory
* 解决问题思路：静态方法不需要初始化
* */

/* 静态工厂方法模式
* 这种方式的问题：类的创建以来工厂类，如果要扩展程序，需要修改工厂类，违背了OCP
* 解决问题思路：需要增加新的功能时，增加新的工厂类，也就是创建多个工厂类，抽象工厂模式
* */

/* 抽象工厂方法模式
* 这样如果想增加一个功能，发及时信息，则只需做一个实现类，实现Sender接口，同时做一个工厂类，实现Provider接口就OK了，无需去改动现成的代码。
* */

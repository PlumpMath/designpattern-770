package singleton._0_simple;

/**
 * Created by twer on 3/22/15.
 */
public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.doHandle();
    }
}

/* 简单单例
* 存在的问题：毫无线程安全保护的类，如果我们把它放入多线程的环境下，肯定就会出现问题了
* 解决思路：对getInstance方法加synchronized关键字
* */
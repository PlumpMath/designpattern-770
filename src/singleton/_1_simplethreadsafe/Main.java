package singleton._1_simplethreadsafe;

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

/* 简单线程安全单例
* 存在的问题：synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降，因为每次调用getInstance()，都要对对象上锁
* 解决思路：只在第一次创建对象的时候需要加锁，之后就不需要了
* */

/* 线程安全单例
* 存在的问题：在Java指令中创建对象和赋值操作是分开进行的，也就是说instance = new Singleton();语句是分两步执行的。但是JVM并不保证这两个操作的先后顺序，也就是说有可能JVM会为新的Singleton实例分配空间，然后直接赋值给instance成员，然后再去初始化这个Singleton实例
* 解决思路：单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。这样当我们第一次调用getInstance的时候，JVM能够帮我们保证instance只被创建一次，并且会保证把赋值给instance的内存初始化完毕，这样我们就不用担心上面的问题。同时该方法也只会在第一次调用的时候使用互斥机制，这样就解决了低性能问题。
* */
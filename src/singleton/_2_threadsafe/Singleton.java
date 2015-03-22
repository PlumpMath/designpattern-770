package singleton._2_threadsafe;

/**
 * Created by twer on 3/22/15.
 */
public class Singleton {

    private Singleton() {
    }

    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }

    public void doHandle() {
        System.out.println("use singleton...");
    }
}

package singleton._3_threadsafe;

/**
 * Created by twer on 3/22/15.
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new Singleton();
        }
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }

    public void doHandle() {
        System.out.println("use singleton...");
    }
}

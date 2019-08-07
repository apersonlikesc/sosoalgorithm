package Design;
//饿汉式
//类初始化时实例化instance
public class Singleton_b2 {
    private Singleton_b2(){}

    private static Singleton_b2 instance;
    static {
        instance = new Singleton_b2();
    }

    public static Singleton_b2 getInstance()
    {
        return instance;
    }
}

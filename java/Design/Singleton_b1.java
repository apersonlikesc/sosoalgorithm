package Design;
//饿汉式
//由于是依赖classloader的加载机制,所以线程安全
//在类加载的时候就进行初始化,会浪费内存
public class Singleton_b1 {
    private Singleton_b1(){};
    private static Singleton_b1 instance = new Singleton_b1();
    public static Singleton_b1 getInstance()
    {
        return instance;
    }
}

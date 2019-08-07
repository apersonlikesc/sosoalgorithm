package Design;
//懒汉式加载
//通过给静态方法加sychronized关键字来对类进行加锁确保线程安全
public class Singleton_a2 {
    private Singleton_a2(){};
    private static Singleton_a2 instance;
    public static synchronized Singleton_a2 getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton_a2();
        }
        return instance;
    }
}

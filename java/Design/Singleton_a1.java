package Design;
//懒汉式加载
//非线程安全
public class Singleton_a1 {

    private Singleton_a1(){}//私有构造函数

    private static Singleton_a1 instance;//静态成员变量

    public static Singleton_a1 getInstance()//获取实例方法
    {
        if(instance==null)
        {
            instance=new Singleton_a1();
        }
        return instance;
    }
}

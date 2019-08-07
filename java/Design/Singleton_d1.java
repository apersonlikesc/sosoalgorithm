package Design;
//使用静态内部类
//Jvm只有在使用内部类的时候才会去加载它,是懒加载
//利用classloader加载机制达到线程安全
public class Singleton_d1 {
    private Singleton_d1(){
    }
    //加载内部类的时候只有一个线程,所以线程安全
    private static class innerClass
    {
        private static final Singleton_d1 instance= new Singleton_d1();
    }

    public static Singleton_d1 getInstance()
    {
        return innerClass.instance;
    }
}

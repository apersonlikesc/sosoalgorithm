package Design;

//双重检验
//第一层普通检验
//当多个线程都进入第一层instance == null后,synchronized确保只有一个线程进行操作
//并且在第一个线程退出后,后面的线程在进入进行第二层判断instance == null,此时instance不是null
public class Singleton_c1 {
    private Singleton_c1(){}
    //volatile确保内存可见性
    private volatile static Singleton_c1 instance;

    public static Singleton_c1 getInstance()
    {
        if(instance == null)
        {
            synchronized(Singleton_c1.class)
            {
                if(instance == null)
                {
                    instance = new Singleton_c1();
                }
            }
        }
        return instance;
    }

}

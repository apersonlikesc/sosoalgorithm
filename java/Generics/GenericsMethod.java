package Generics;

public class GenericsMethod<T> {
    private T key;
    public T hello()
    {
        return key;
    }

    public <T>  T hello(GenericsClass<T> genericsClass)
    {
        T a = genericsClass.getKey();
        return a;
    }
}

package Generics;

public class GenericsClass<T> {
    private T key;

    public GenericsClass(T key)
    {
        this.key = key;
    }

    public T getKey() {
        return key;
    }
}

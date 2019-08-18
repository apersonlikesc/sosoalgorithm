package Generics;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
       List<Object> a1 = new ArrayList();
       Object o = (Object) new String("123");
       a1.add(o);
       List<? super Number> c = a1;
       System.out.println(c.get(0).getClass());

    }
}

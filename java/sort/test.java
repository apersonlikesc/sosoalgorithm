package sort;


import Util.Util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
//        Iterator iterator = b.iterator();
//        while(iterator.hasNext())
//        {
//            if(iterator.next().equals(3))
//            {
//                iterator.remove();
//                iterator.next();
//            }
//        }
        for(int i = 0;i<b.size();i++)
        {
            if(b.get(i) == 5)
            {
                b.remove(i);
            }
        }
//        CopyOnWriteArrayList<Integer> a = new CopyOnWriteArrayList<>();

    }
}

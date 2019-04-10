package nowcoder;

import java.util.ArrayList;
import java.util.Collections;

public class solution40_3 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(k>input.length||k<=0)
        {
            return list;
        }
        for(int num:input)
        {
            list.add(num);
        }
        Collections.sort(list);

        return new ArrayList<>(list.subList(0,k));
    }
}

package nowcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class solution40 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(k>input.length||k<=0)
        {
            return new ArrayList<>();
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1,o2)->o1-o2);//从大到小
        for(int num : input)
        {
            maxHeap.add(num);
            if(maxHeap.size()>k)
            {
                maxHeap.poll();
            }
        }
        return new ArrayList<>(maxHeap);

    }
}

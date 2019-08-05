package nowcoder;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class solution59 {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> ret = new ArrayList<>();
        if(size > num.length ||size < 1)
        {
            return ret;
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1,o2)->o2-o1);//从小到大 大顶堆
        for(int i =0;i<size;i++)
        {
            heap.add(num[i]);
        }
        ret.add(heap.peek());
        for(int i =0,j = i+size;j<num.length;i++,j++)
        {
            heap.remove(num[i]);//移除最小的
            heap.add(num[j]);//添加后一个数
            ret.add(heap.peek());//在结果集中加入最大值
        }
        return ret;
    }
}

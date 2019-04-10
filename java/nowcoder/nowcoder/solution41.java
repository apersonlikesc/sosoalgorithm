package nowcoder;

import java.util.PriorityQueue;

public class solution41 {
    private PriorityQueue<Integer> left = new PriorityQueue<>((o1,o2)->o2-o1);//从小到大
    private PriorityQueue<Integer> right = new PriorityQueue<>();//从大到小

    private int n = 0;
    public void Insert(Integer num) {
        if(n%2 == 0)
        {
            left.add(num);
            right.add(left.poll());
        }else{
            right.add(num);
            left.add(right.poll());
        }
        n++;
    }

    public Double GetMedian() {
        if(n%2 == 0)
        {
            return (left.peek()+right.peek())/2.0;
        }else{
            return (double)right.peek();
        }
    }

}

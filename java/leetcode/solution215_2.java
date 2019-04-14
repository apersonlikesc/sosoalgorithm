import java.util.PriorityQueue;

public class solution215_2 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();//默认是从小到大
        for(int var : nums)
        {
            pq.add(var);
            if(pq.size() > k)
            {
                pq.poll();
            }
        }
        return pq.peek();

    }
    }

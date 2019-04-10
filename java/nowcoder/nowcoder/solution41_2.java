package nowcoder;

import java.util.LinkedList;
import java.util.Queue;

public class solution41_2 {
    private int[] cnts =new int[256];
    private Queue<Character> queue = new LinkedList<>();
    public void Insert(char ch)
    {
        cnts[ch]++;
        queue.add(ch);
        while(!queue.isEmpty()&&cnts[queue.peek()]>1)
        {
            queue.poll();
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        return queue.isEmpty()?'#':queue.peek();
    }
}

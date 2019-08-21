package leetcode.retry;

public class solution416 {
    public int hammingDistance(int x, int y) {
        int ret = x^y;
        int count = 0;
        while(ret !=0)
        {
            if((ret&1) == 1)
            {
                count++;
            }
            ret = ret>>1;
        }
        return count;
    }
}

package leetcode.retry;

public class solution204 {
    public int countPrimes(int n) {
        boolean[] booleans = new boolean[n];
        int count = 0;
        for(int i = 2;i<n;i++)
        {
            if(!booleans[i])
            {
                count++;
                for(int j = 2;j*i<n;j++)
                {
                    booleans[j*i] = true;
                }
            }
        }
        return count;
    }
}

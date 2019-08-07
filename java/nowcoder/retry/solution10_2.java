package nowcoder.retry;

public class solution10_2 {
    public int Fibonacci(int n)
    {
        int[] pre =new int[2];
        pre[0] = 1;
        pre[1] = 2;
        if(n<2)
        {
            return pre[n];
        }
        for(int i = 3;i<=n;i++)
        {
            pre[0] = pre[0] + pre[1];
            Util.swap(pre,0,1);
        }
        return pre[1];
    }
}

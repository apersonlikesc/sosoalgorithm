package nowcoder.retry;

public class solution10 {
    public int Fibonacci(int n)
    {
        int[] pre =new int[2];
        pre[0] = 0;
        pre[1] = 1;
        if(n<2)
        {
            return pre[n];
        }
        for(int i = 2;i<=n;i++)
        {
            pre[0] = pre[0] + pre[1];
            Util.swap(pre,0,1);
        }
        return pre[1];
    }
}

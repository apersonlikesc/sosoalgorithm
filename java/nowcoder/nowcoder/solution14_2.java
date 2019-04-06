package nowcoder;

public class solution14_2 {
    public int integerBreak(int n){
        int[] dp = new int[n+1];
        dp[2] = 1;
        for(int i = 2;i<=n;i++)
        {
            for(int j =1;j<i;j++)
            {
                dp[i] = Math.max(dp[i],Math.max(j*(i-j),dp[j]*(i-j)));
                ////我们可能理解比如3拆分为1*dps[2]应该为最大，因为这里dps[2]
                //已经是将2拆分为最大了，但是有可能1*2更大，所以需要比较一下。每一次比较都和之前的值比对.
            }
        }
        return dp[n];
    }
}

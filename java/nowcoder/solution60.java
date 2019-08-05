package nowcoder;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class solution60 {
    public List<Map.Entry<Integer,Double>> dicesum(int n)
    {
        final int face = 6;//一共有六个面
        final int pointNum = face * n;//总共有point的点数(总和,最大值)
        long[][] dp = new long[n+1][pointNum+1];

        for(int i =1;i<=face;i++)
        {
            dp[1][i] =1;//一个骰子产生i点点数的次数
        }

        for(int i =2;i<=n;i++)//从第二个骰子开始共有n个骰子
        {
            for(int j = i;j<=pointNum;j++)//i个骰子最少是i,最多是pointNum
            {
                for(int k = 1;k<=face && k<=j;j++)
                {
                    dp[i][j] += dp[i-1][j-k];
                }
            }
        }

        final double totalNum = Math.pow(6,n);
        List<Map.Entry<Integer,Double>> ret = new ArrayList<>();
        for(int i = n;i<=pointNum;i++)
        {
            ret.add(new AbstractMap.SimpleEntry<>(i,dp[n][i] / totalNum));
        }
        return ret;
    }
}

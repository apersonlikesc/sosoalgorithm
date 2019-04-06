package nowcoder;

public class solution20 {
    public boolean match(char[] str, char[] pattern) {
        int m=str.length,n=pattern.length;
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        for(int i = 1;i<=n;i++)
        {
            if(pattern[i-1]=='*')
            {
                dp[0][i] = dp[0][i-2];
            }
        }
        for(int i = 1;i<=m;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if(str[i-1] == pattern[j-1]||pattern[j-1]=='.')
                {
                    dp[i][j]=dp[i-1][j-1];
                }else if(pattern[j-1] =='*')
                {
                    if(pattern[j-2]==str[i-1]|| pattern[j-2]=='.')
                    {
                        dp[i][j] |= dp[i][j-1];//前面的pattern相等
                        dp[i][j] |= dp[i][j-2];//看作没有匹配到
                        dp[i][j] |= dp[i-1][j];//前一个str能匹配,现在必能匹配

                    }else{
                        dp[i][j] = dp[i][j-2];
                    }
                }
            }
        }
        return dp[m][n];
    }
}

package nowcoder;

public class solution43 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int cnt = 0;
        for(int m = 1;m<=n;m*=10)
        {
            //i表示当前分析的是哪一个数位
            int a=n/m,b=n%m;
            cnt += (a+8/10)*m+(a%10==1?b+1:0);
        }
        return cnt;
    }
}

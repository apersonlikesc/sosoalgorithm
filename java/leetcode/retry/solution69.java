package leetcode.retry;

public class solution69 {
    public int mySqrt(int x) {
        int l = 1;
        int h = x;
        while(l<=h)
        {
            int m = l+(h-l)/2;

            if( x/m == m)
            {
                return m;
            }
            if(x/m < m)
            {
                h = m-1;
            }else{
                l = m+1;
            }
        }
        return l-1;
    }
}

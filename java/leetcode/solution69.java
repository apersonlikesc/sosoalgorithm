public class solution69 {
    public int mySqrt(int x) {
        if(x <= 1)
        {
            return x;
        }

        int l  =1,h = x;

        while(l<h)
        {
            int m = l+(h-l)/2;
            int sqrt = x / m;
            if(sqrt <= m)
            {
                h = m;
            }else{
                l = m + 1;
            }
        }
        return x/l;
    }
}

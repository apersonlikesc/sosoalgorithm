package nowcoder;

public class solution14 {
    public int integerBreak(int n) {
        if(n<2)
        {
            return 0;
        }
        if(n==2)
        {
            return 1;
        }
        if(n==3)
        {
            return 2;
        }

        int timesof3 = n/3;
        if(n-timesof3*3 == 1)
        {
            timesof3--;
        }
        int timesof2 = (n-timesof3*3)/2;
        return (int)Math.pow(3,timesof3)*(int)Math.pow(2,timesof2);
    }
}

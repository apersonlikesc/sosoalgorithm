package nowcoder;

public class solution64 {
    public int Sum_Solution(int n)
    {
        int sum = n;
        boolean b = (n>0) &&((sum +=Sum_Solution(n-1))>0);//当n<=0的时候 短路了
        return sum;
    }
}

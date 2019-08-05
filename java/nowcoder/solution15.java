package nowcoder;

public class solution15 {
    public int NumberOf1(int n) {
        int count = 0;
        while(n!=0)
        {
            count++;
            n&=n-1;
        }
        return count;
    }
}
//    public int NumberOf1(int n) {
//        return Integer.bitCount(n);
//    }
package nowcoder;

public class solution66 {
    public int[] multiply(int[] A)
    {
        int n = A.length;
        int[] B = new int[n];
        for(int i =0,produce = 1;i<n;produce *=A[i],i++)//produce累乘的都是前面的数(从第二个数开始)
        {
            B[i] = produce;
        }
        for(int i = n-1,produce =1;i>=0;produce *= A[i],i--)//produce累乘从倒数第二个数开始
        {
            B[i] *= produce;
        }
        return B;
    }
}

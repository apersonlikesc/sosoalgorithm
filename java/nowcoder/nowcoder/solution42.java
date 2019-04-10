package nowcoder;

public class solution42 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array == null||array.length == 0){
            return 0;
        }
        int greatestsum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : array)
        {
            sum = sum <=0?i:sum+i;
            greatestsum = Math.max(sum,greatestsum);
        }
        return greatestsum;
    }
}

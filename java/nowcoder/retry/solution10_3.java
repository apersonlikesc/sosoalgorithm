package nowcoder.retry;

import java.util.Arrays;

public class solution10_3 {
    public int JumpFloorII(int target) {
        int[] array = new int[target];
        Arrays.fill(array,1);
        for(int i = 1;i<target;i++)
        {
            for(int j =i-1;j>=0;j--)
            {
                array[i] = array[j]+array[i];
            }
        }
        return array[target-1];
    }
}

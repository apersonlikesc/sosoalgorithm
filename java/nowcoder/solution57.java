package nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class solution57 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int i = 0,j=array.length-1;
        while(i<j)
        {
            if(array[i]+array[j] == sum)
            {
                return new ArrayList<>(Arrays.asList(array[i],array[j]));
            }

            if(array[i]+array[j] > sum)
            {
                j--;
            }else{
                i++;
            }
        }
        return new ArrayList<>();
    }
}

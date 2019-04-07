package nowcoder;

public class solution21 {
    public void reOrderArray(int [] array) {
        int oddcount = 0;
        for(int val:array)
        {
            if(val%2 == 1)
            {
                oddcount++;
            }
        }
        int i = 0,j=oddcount;
        int[] nums = array.clone();
        for(int num:nums)
        {
            if(num%2 == 1)
            {
                array[i++] = num;
            }else{
                array[j++] = num;
            }
        }
    }
}

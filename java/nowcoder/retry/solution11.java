package nowcoder.retry;

public class solution11 {
    public int minNumberInRotateArray(int[] nums) {
        if (nums.length == 0)
            return 0;
        int low = 0;
        int high = nums.length-1;
        while(low!=high)
        {
            int m = (high + low)/2;
            if(nums[m] > nums[low])
            {
                low = m;
            }else{
                high = m;
            }
        }
        return nums[low+1];
    }
}

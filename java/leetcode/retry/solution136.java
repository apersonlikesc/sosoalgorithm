package leetcode.retry;

public class solution136 {
    public int singleNumber(int[] nums) {
        int j = nums[0];
        for(int i = 1;i<nums.length;i++)
        {
            j = j^nums[i];
        }
        return j;
    }
}

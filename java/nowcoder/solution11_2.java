public class solution11_2 {
    public int minNumberInRotateArray(int[] nums) {
        if(nums.length == 0)
        {
            return  0;
        }
        int l=0,h = nums.length-1;
        while(l<h)
        {
            int m = l+(h-l)/2;
            if(nums[l]==nums[m]&&nums[m]==nums[h])
            {
                    return minNumer(nums,l,h);
            }else if(nums[m]<=nums[h])
            {
                h= m;
            }else{
                l = m+1;
            }

        }
        return nums[l];
    }

    private int minNumer(int[] nums, int l, int h) {
        for(int i = l;i<h;i++)
        {
            if(nums[i] > nums[i+1])
            {
                return nums[i+1];
            }
        }
        return nums[l];
    }
}

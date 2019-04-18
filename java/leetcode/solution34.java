public class solution34 {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null||nums.length== 0)
        {
            return new int[]{-1,-1};
        }
        int first = BinarySearch(nums,target);
        if(nums[first]!=target)
        {
            return new int[]{-1,-1};
        }
        int last = BinarySearch(nums,target+1);
        if(nums[last]!=target)
            last--;
        return new int[]{first,last};
    }

    private int BinarySearch(int[] nums,int target)
    {
        int l =0;
        int h = nums.length -1;
        while(l<h)
        {
            int m = l + (h-l)/2;
            if(nums[m] >= target)
            {
                h= m ;
            }else{
                l = m+1;
            }
        }
        return l;
    }

}

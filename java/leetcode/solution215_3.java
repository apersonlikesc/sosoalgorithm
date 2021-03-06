public class solution215_3 {
    public int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        int l = 0;
        int h = nums.length - 1;
        while(l<h)
        {
            int j = partition(nums,l,h);
            if(j == k)
            {
                break;
            }else if(j < k)
            {
                l = j+1;
            }else {
                h = j - 1;
            }
        }
        return nums[k];
    }

    private int partition(int[] nums, int l, int h) {
        int i = l;
        int j = h+1;
        while(true)
        {
            while (nums[++i]<nums[l]&&i<h);
            while (nums[--j]>nums[l]&&j>l);
            if(i>=j)
            {
                break;
            }
            swap(nums,i,j);
        }
        swap(nums,l,j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


}

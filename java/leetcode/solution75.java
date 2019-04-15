public class solution75 {
    public void sortColors(int[] nums) {
        int zero = -1;
        int one = 0;
        int two = nums.length;
        while(one < two)
        {
            if(nums[one] == 0)
            {
                swap(nums,++zero,one++);
            }else if(nums[one] == 2){
                swap(nums,--two,one++);
            }else{
                one++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

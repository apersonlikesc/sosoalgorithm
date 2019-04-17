public class binarySearch {
    public int BinarySearch1(int[] nums,int key){
        int l = 0,h = nums.length-1;
        while(l<=h)
        {
            int m = (l+h)/2;
            if(nums[m] == key)
            {
                return m;
            } else if(nums[m]<key)
            {
                l = m+1;
            }else {
                h = m-1;
            }
        }
        return -1;
    }

    public int BinarySearch2(int[] nums,int key)
    {
        int l = 0,h = nums.length-1;
        while(l<h)
        {
            int m = l + (h-l)/2;
            if(nums[m] >= key)
            {
                h=m;
            }else{
                l = m+1;
            }
        }
        return l;
    }
}

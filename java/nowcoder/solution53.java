package nowcoder;


public class solution53 {
    public int GetNumberOfK(int [] array , int k) {
        int first = MybinarySearch(array,k);
        int last = MybinarySearch(array, k + 1);
        return (first==array.length||array[first]!=k)?0:last-first;//nums[first] != K 说明没有找到
        //first==array.length 说明在最后
    }

    private int MybinarySearch(int[] array, int k) {
        int l = 0,h = array.length;
        while(l<h)
        {
            int m = (l+h)/2;
            if(array[m]>=k)//这里的大于等于是为了k能够留在最开始的重复的数字上
            {
                h = m;
            }else{
                l=m+1;
            }
        }
        return l;
    }
}

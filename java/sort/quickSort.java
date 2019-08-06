package sort;

import Util.Util;

public class quickSort {
    //得调用递归,之前不用递归出不来...
    public int[] sort(int[] a,int low,int high){
        if(low<high)
        {
            int index = partition(a,low,high);
            sort(a,low,index-1);
            sort(a,index+1,high);
        }
        return a;

    }

    public int partition(int[] a,int low,int high)
    {
        int pivot = a[low];
        while(low<high)
        {
            while(low<high && pivot <= a[high])
            {
                high--;
            }
            a[low] = a[high];//由于有个副本pivot,所以直接覆盖了
            while(low<high && pivot >= a[low]){
                low++;
            }
            a[high] = a[low];
        }
        a[low] = pivot;
        return low;
    }


}

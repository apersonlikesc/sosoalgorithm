package sort;

import Util.Util;

public class quickSort {
    public int[] quickSort(int[] a){
        for(int i = 0;i<a.length;i++)
        {
            int start = 0;
            int end = a.length -1;
            boolean swap = false;
            int one = a[i];
            while(start != end)
            {
                if(!swap)
                {
                    if(one > a[end]){
                        Util.swap(a,start,end);
                        swap = true;
                    }
                    end--;
                }else{
                    if(one < a[start]){
                        Util.swap(a,start,end);
                        swap = false;
                    }
                    start++;
                }
            }
        }
        return a;
    }
}

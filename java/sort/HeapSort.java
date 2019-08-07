package sort;

import Util.Util;

public class HeapSort {
    public int[] sort(int[] a)
    {
        for(int i = a.length/2-1;i>=0;i--)
        {
            HeapAdjust(a,i,a.length-1);
        }

        for(int i = a.length-1;i>=0;i--)
        {
            Util.swap(a,0,i);
            HeapAdjust(a,0,i-1);
        }

        return a;
    }

    public void HeapAdjust(int[] a,int l,int h)
    {
        int temp = a[l];
        for(int j = 2*l+1;j<=h;j=j*2+1)//得到子节点的最大值
        {
            if(j+1 <=h && a[j] < a[j+1])
            {
                j++;
            }
            if(temp < a[j])
            {
                a[l] = a[j];
                l = j;
            }
        }
        a[l] = temp;
    }

}

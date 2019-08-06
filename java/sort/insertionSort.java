package sort;

import Util.Util;

public class insertionSort {
    //插入排序也是一种思想很简单的排序方法，
    // 它通过比较当前元素和其之前已排好序的元素的大小，
    // 找到合适的位置插入，并把插入位置后的元素往后移动。
    public int[] sort(int[] a)
    {
        for (int i = 1;i<a.length;i++)
        {
            int now = a[i];
            int index = i;
            for(int j = i;j>=1;j--)
            {
                if(now < a[j-1])
                {
                    a[j] = a[j-1];
                    index = j-1;
                }
            }
            a[index] = now;
        }
        return a;
    }

}

package sort;

public class MergeSort {
    public int[] sort(int[] a,int left,int right)
    {
        if(left < right)
        {
            int mid = (left+right)/2;
            sort(a,left,mid);
            sort(a,mid+1,right);
            merge(a,left,mid,right);
        }
        return a;
    }

    public void merge(int[] a, int left, int mid, int right)
    {
        int[] temp = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int t = 0;//临时数组指针
        while(i<=mid&&j<=right)
        {
            if(a[i] < a[j])
            {
                temp[t++] = a[i++];
            }else{
                temp[t++] = a[j++];
            }
        }
        while(i<=mid)
        {
            temp[t++] = a[i++];
        }
        while(j<=right)
        {
            temp[t++] = a[j++];
        }
        t = 0;
        while(left<=right)
            a[left++] = temp[t++];
    }


}

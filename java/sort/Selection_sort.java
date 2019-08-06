package sort;

public class Selection_sort {
    public int[] sort(int[] a){//不断的挑选出未排序的最小的数

        for (int i=0;i<a.length-1;i++)
        {
            int flag = a[i];
            int minindex = i;
            for (int j = i+1;j<a.length;j++)
            {
                if(a[j] < a[minindex])
                {
                    minindex = j;
                }
            }
            Util.Util.swap(a,i,minindex);
        }
        return a;
    }

}

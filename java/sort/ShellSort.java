package sort;

public class ShellSort {
    //和直接插入排序差不多,只是多了步长,并不断减少步长
    public int[] sort(int[] a)
    {
        int section = a.length/2;
        while(section>=1)
        {
            for(int i = section;i<a.length;i++)
            {
                int now = a[i];
                int index = i;
                for(int j = i-section;j>=0;)
                {
                    if(now < a[j])
                    {
                        a[j+section] = a[j];
                        index = j;
                    }
                    j = j-section;
                }
                a[index] = now;
            }
            section = section/2;
        }
        return a;
    }
}

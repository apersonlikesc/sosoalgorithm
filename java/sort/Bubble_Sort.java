package sort;
public class Bubble_Sort {
    //冒泡排序
    public int[] bubbleSort(int[] a){
        if(a == null ||a.length==0)
        {
            return a;
        }
        for(int i = 0;i<a.length-1;i++)
        {
            for(int j = i+1;j<a.length;j++)
            {
                if(a[i] > a[j])
                {
                    Util.Util.swap(a,i,j);
                }
            }
        }
        return a;
    }
}

package nowcoder;

public class solution51 {
    private long cnt = 0;
    private int[] tmp;
    public int InversePairs(int [] array) {
        tmp = new int[array.length];
        mergeSort(array,0,array.length-1);
        return (int) (cnt%1000000007);
    }

    private void mergeSort(int[] array, int l, int h) {
        if(h-l < 1)//只有一个的时候返回
        {
            return;
        }
        int m = (h+l)/2;
        mergeSort(array,l,m);
        mergeSort(array,m+1,h);
        merge(array,l,m,h);

    }

    private void merge(int[] array, int l, int m, int h) {
        int i = l,j=m+1,k=l;
        while(i<=m||j<=h)
        {
            if(i>m)//这是为了将 当后面的没有数字的时候把前面的数放到tmp数组中
            {
                tmp[k] = array[j++];
            }else if(j>h)
            {
                tmp[k] = array[i++];
            }else if (array[i] < array[j])
            {
                tmp[k] = array[i++];//小的数字放在前面
            }else{
                tmp[k] = array[j++];
                this.cnt +=m-i+1;//由于前面部分都是排序好的,所以nums[i] >= nums[j]，说明 nums[i...mid] 都大于 nums[j]
            }
            k++;
        }
        for(k=l;k<=h;k++)
        {
            array[k] = tmp[k];//将排序好的数组赋值给array 为了下一次的排序
        }

    }
}

package nowcoder.retry;

public class Util {

    /*交换数据中的两个数字
     */
    public static void swap(int[] array,int i,int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

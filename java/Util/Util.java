package Util;

public class Util {

    /*交换数组中的两个数字
     */
    public static void swap(int[] array,int i,int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    /*
    打印数组
     */
    public static<T> void printArray(T[] array)
    {
        for (T a: array) {
            System.out.println(a+" ");
        }
    }
}

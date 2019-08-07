package sort;


import Util.Util;

public class test {
    public static void main(String[] args) {
        HeapSort a = new HeapSort();
        int[] b = {7,3,31,8,112,4,1,2,4,1};
        int[] b1 = a.sort(b);
        for(int i = 0;i<b1.length;i++)
        {
            System.out.println(b1[i]);
        }
    }
}

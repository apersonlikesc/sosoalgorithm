package sort;


import Util.Util;

public class test {
    public static void main(String[] args) {
        quickSort a = new quickSort();
        int[] b = {4,1,2,4,1};
        int[] b1 = a.quickSort(b);
        for(int i = 0;i<b1.length;i++)
        {
            System.out.println(b1[i]);
        }
    }
}

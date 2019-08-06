package sort;


import Util.Util;

public class test {
    public static void main(String[] args) {
        MergeSort a = new MergeSort();
        int[] b = {7,3,31,8,112,4,1,2,4,1};
        int[] b1 = a.sort(b,0,b.length-1);
        for(int i = 0;i<b1.length;i++)
        {
            System.out.println(b1[i]);
        }
    }
}

package nowcoder;

import java.util.ArrayList;

public class solution40_2 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> ret = new ArrayList<>();
        if(k>input.length||k<=0)
        {
            return ret;
        }
        findKthSmallth(input,k-1);
        for(int i = 0;i<k;i++)
        {
            ret.add(input[i]);
        }
        return ret;
    }

    private void findKthSmallth(int[] input, int k) {
        int l = 0;
        int h = input.length -1;
        while(l<h)
        {
            int j = partition(input,l,h);
            if(j==k)
            {
                break;
            }
            if(j>k)//j的左边的数都比j小 j右边的数都比j大
            {
                h = j-1;
            }else{
                l = j+1;
            }

        }

    }

    private int partition(int[] input, int l, int h) {
        int p = input[l];
        int i = l,j = h+1;
        while(true)
        {
            while(i!=h&&input[++i]<p);//从左往右依次找到比p大的数
            while(j!=l&&input[--j]>p);//从右往左依次找到比p小的数
            if(i>=j)//交叉点
            {
                break;
            }
            swap(input,i,j);
        }
        swap(input,l,j);
        return j;
    }
    private void swap(int[] nums,int i,int j )
    {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}

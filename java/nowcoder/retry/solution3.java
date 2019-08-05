package nowcoder.retry;
/*
在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。
请找出数组中任意一个重复的数字。
 */
public class solution3 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null || length ==0)
        {
            return false;
        }
        for(int i=0;i<numbers.length;i++)
        {
            while(numbers[i] != i)
            {
                if(numbers[i] == numbers[numbers[i]])
                {
                    duplication[0] =numbers[i];
                    return true;
                }
                Util.swap(numbers,i,numbers[i]);
            }
        }
        return false;
    }

}

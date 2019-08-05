package nowcoder;

import java.util.Arrays;

public class solution61 {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length<5)
        {
            return false;
        }
        Arrays.sort(numbers);

        int cnt = 0;
        for(int num:numbers)
        {
            if(num == 0)
            {
                cnt++;//计算大小王的数量
            }
        }


        for(int i = cnt;i<numbers.length-1;i++)//已经排好序了
        {
            if(numbers[i+1] == numbers[i])
            {
                return false;
            }
            cnt -= numbers[i+1] - numbers[i] -1;//减去相差的数
        }
        return cnt >=0;
    }
}

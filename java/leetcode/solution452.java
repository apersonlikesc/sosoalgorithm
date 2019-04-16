import java.util.Arrays;
import java.util.Comparator;

public class solution452 {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0)//points的length是气球的个数  point[]里面只有两个数 start 和 end
        {
            return 0;
        }
        Arrays.sort(points, Comparator.comparingInt(o->o[1]));
        int cnt = 1;
        int end = points[0][1];
        for(int i = 1;i<points.length;i++)
        {
            if(points[i][0] <= end)//重复 下一个start和上一个的end比较
            {
                continue;
            }
            cnt++;
            end = points[i][1];
        }
        return cnt;
    }
}

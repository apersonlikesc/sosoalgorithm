import java.util.Arrays;
import java.util.Comparator;

public class solution435 {
    public int eraseOverlapIntervals(Interval[] intervals) {
        if(intervals.length == 0)
        {
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o->o.end));//一般来说都是从小到大排序
        int cnt = 1;
        int end = intervals[0].end;
        for(int i = 1;i<intervals.length;i++)
        {
            if(intervals[i].start < end)
            {
                continue;
            }
            end = intervals[i].end;
            cnt++;
        }
        return intervals.length-cnt;
    }
}

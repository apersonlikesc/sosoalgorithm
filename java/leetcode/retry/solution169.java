package leetcode.retry;

import java.util.HashMap;
import java.util.Iterator;

public class solution169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        int max = 0;
        int ret = 0;
        for(int i = 0;i<nums.length;i++){
            int j = a.getOrDefault(nums[i],0);
            a.put(nums[i],++j);
        }
        Iterator<Integer> iterator = a.keySet().iterator();
        while(iterator.hasNext())
        {
            int key = iterator.next();
            if(a.get(key)> max)
            {
                max = a.get(key);
                ret = key;
            }
        }
        return ret;
    }
}

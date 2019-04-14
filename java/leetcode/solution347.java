import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class solution347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyForNum = new HashMap<>();

        for(int num : nums)
        {
            frequencyForNum.put(num,frequencyForNum.getOrDefault(num,0)+1);
        }

        ArrayList[] buckects = new ArrayList[nums.length+1];
        for(int key:frequencyForNum.keySet())
        {
            int frequency = frequencyForNum.get(key);
            if(buckects[frequency] == null)
            {
                buckects[frequency] = new ArrayList();
            }
            buckects[frequency].add(key);
        }

        ArrayList<Integer> topk = new ArrayList<>();
        for(int i  = buckects.length-1;i>=0&&topk.size()<k;i--)
        {
            if(buckects[i] == null)
            {
                continue;
            }
            if(buckects[i].size() <= (k-topk.size()))
            {
                topk.addAll(buckects[i]);
            }
            else{
                topk.addAll(buckects[i].subList(0,k-topk.size()));
            }
        }
        return topk;
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class solution451 {
    public String frequencySort(String s) {
        Map<Character,Integer> frequencyForChar = new HashMap<>();
        char[] chars = s.toCharArray();
        for(char c : chars)
        {
            frequencyForChar.put(c,frequencyForChar.getOrDefault(c,0)+1);
        }

        ArrayList<Character>[] buckets = new ArrayList[chars.length+1];
        for(char key:frequencyForChar.keySet())
        {
            int frequency = frequencyForChar.get(key);
            if(buckets[frequency] == null)
            {
                buckets[frequency] = new ArrayList();
            }
            buckets[frequency].add(key);
        }
        StringBuilder str  = new StringBuilder();
        for(int i = buckets.length-1;i>=0;i++){
            if(buckets[i] == null)
            {
                continue;
            }
            for(char c :buckets[i])
            {
                for(int j = 0;j<i;j++)
                    str.append(c);
            }
        }
        return str.toString();
    }
}

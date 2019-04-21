import java.util.HashMap;

public class solution771 {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] chars = S.toCharArray();
        int sum = 0;
        for (char c:chars)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        char[] chars1 = J.toCharArray();
        for(char c : chars1)
        {
            sum = sum+ map.getOrDefault(c,0);
        }
        return sum;
    }
}

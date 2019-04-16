import java.util.HashMap;
import java.util.LinkedHashMap;

public class solution423 {
    private final String[] StringForNum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    HashMap<Character, Integer> map = new HashMap<>();
    HashMap<String,Integer> map1 = new LinkedHashMap<>();
    HashMap<String,Integer> map2 = new LinkedHashMap<>();
    int[] num = new int[10];

    public String originalDigits(String s) {
        map1.put("eight",8);
        map1.put("zero",0);
        map1.put("two",2);
        map1.put("six",6);
        map1.put("four",4);
        map2.put("seven",7);
        map2.put("five",5);
        map2.put("three",3);
        map2.put("nine",9);
        map2.put("one",1);
        char[] chars = s.toCharArray();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (String key:map1.keySet()) {
            int i = map1.get(key);
            while (isOk(key)) {
                num[i]++;
            }
        }
        for (String key:map2.keySet()) {
            int i = map2.get(key);
            while (isOk(key)) {
                num[i]++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            while (num[i] > 0) {
                stringBuilder.append(i);
                num[i]--;
            }
        }
        return stringBuilder.toString();
    }


    public boolean isOk(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        for (char c : chars) {
            if (map.get(c) == null || map.get(c) == 0) {
                return false;
            }
            sum++;
        }
        if(sum ==s.length())
        {
            for(char c : chars)
            {
                map.put(c,map.get(c)-1);
            }
        }
        return true;
    }
}

package nowcoder;

import java.util.Arrays;

public class solution45 {
    public String PrintMinNumber(int [] numbers) {
            if(numbers==null||numbers.length==0)
            {
                return "";
            }
            int n = numbers.length;
            String[] num = new String[n];
            for(int i=0;i<n;i++)
            {
                num[i] = numbers[i]+"";
            }
        Arrays.sort(num,(s1,s2)->(s1+s2).compareTo(s2+s1));
        StringBuilder ret = new StringBuilder();
        for(String str:num)
        {
            ret.append(str);
        }
        return ret.toString();
    }
}

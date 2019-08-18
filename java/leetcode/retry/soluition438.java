package leetcode.retry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soluition438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ret = new ArrayList<>();
        int[] a = new int[26];
        int[] b = new int[26];
        if ("".equals(s)||"".equals(p)||s.length()<p.length())
        {
            return ret;
        }
        for(char c:p.toCharArray())
        {
            a[c-'a']++;
        }
        for(int i = 0;i<p.length();i++)
        {
            b[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(a,b))
        {
            ret.add(0);
        }
        for(int i = 1;i<s.length()-p.length()+1;i++)
        {
            b[s.charAt(i-1)-'a']--;
            b[s.charAt(i+p.length()-1)-'a']++;
            if(Arrays.equals(a,b))
            {
                ret.add(i);
            }
        }

        return ret;
    }
}

package leetcode.retry;

import java.util.Arrays;
import java.util.HashMap;

public class solution5048 {
    public int countCharacters(String[] words, String chars) {
        int[] a = new int[26];
        boolean c = false;
        int count = 0;
        for(int i = 0;i<chars.length();i++)
        {
            a[chars.charAt(i)-'a']++;
        }
        for(int i = 0;i<words.length;i++)
        {
            int[] b = Arrays.copyOf(a,a.length);
            for(int j = 0;j<words[i].length();j++)
            {
                if(--b[words[i].charAt(j)-'a']<0)
                {
                    c = true;
                 break;
                }
            }
            if(c)
            {
                c=!c;
            }
            else{
                count = count+words[i].length();
            }
        }
        return count;
    }
}

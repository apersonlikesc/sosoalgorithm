package nowcoder;

import java.util.Arrays;

public class solution48 {
    public int longestSubStringWithoutDuplication(String str) {
        int curLen = 0;
        int maxLen = 0;

        int[] preIndexs = new int[26];
        Arrays.fill(preIndexs,-1);

        for(int curi = 0;curi<str.length();curi++)
        {
            int c = str.charAt(curi)-'a';
            int prei = preIndexs[c];
            if(prei ==  -1 || curi - prei>curLen)
            {
                curLen++;
            }else{
                maxLen = Math.max(maxLen,curLen);
                curLen = curi - prei;
            }
            preIndexs[c] = curi;
        }
//        maxLen = Math.max(maxLen,curLen);
        return maxLen;
    }
}

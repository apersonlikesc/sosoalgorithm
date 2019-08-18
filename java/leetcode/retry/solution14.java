package leetcode.retry;

public class solution14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer ret = new StringBuffer();
        int min = Integer.MAX_VALUE;
        for(int j = 0;j<strs.length;j++)
        {
            if(min > strs[j].length())
            {
                min = strs[j].length();
            }
        }
        for(int i =1;i<min;i++)
        {
            String a = strs[0].substring(0,i);
            for(int j = 0;j<strs.length;j++)
            {

            }
        }
        return ret.toString();
    }
}

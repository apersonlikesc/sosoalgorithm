package leetcode.retry;

public class solution744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int h = letters.length-1;
        while(l<=h)
        {
            int m = l+(h-l)/2;
            if(letters[m]<=target)
            {
                l = m+1;
            }else{
                h = m-1;
            }
        }
        return l < letters.length?letters[l]:letters[0];
    }
}

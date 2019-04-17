public class solution744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0,h = letters.length-1;
        while(l<h)
        {
            int m = l+(h-l)/2;
            if(letters[m]>target)
            {
                h = m;
            }else{
                l = m + 1;
            }
        }
        return letters[l]>target?letters[l]:letters[0];
    }
}
public class solution392 {
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        char[] chars = s.toCharArray();
        for(char c:chars)
        {
            index = t.indexOf(c,index+1);
            if(index == -1)
            {
                return false;
            }
        }
        return true;
    }
}

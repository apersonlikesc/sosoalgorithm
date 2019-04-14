public class solution680_2 {
    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length-1;
        boolean flag = true;
        while(start < end)
        {
            if(chars[start] == chars[end])
            {
                start++;
                end--;
            }else if(!flag){
                break;
            }
            else if(s.length()>=4&&chars[start+1] == chars[end]&& chars[start] == chars[end-1])
            {
                if((chars[start+1] == chars[end]&& chars[start+2] == chars[end-1]))
                {
                    start++;
                    flag=false;
                }else if((chars[start] == chars[end-1]&& chars[start+1] == chars[end-2]))
                {
                    end--;
                    flag = false;
                }
            }
            else if(chars[start+1] == chars[end]){
                start = start+1;
                flag = false;
            }else if(chars[start] == chars[end-1]){
                end = end - 1;
                flag = false;
            }else{
                return false;
            }
        }
        return true;
    }
}

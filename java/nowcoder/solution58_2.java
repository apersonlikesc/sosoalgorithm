package nowcoder;

public class solution58_2 {
    public String LeftRotateString(String str,int n) {
        if(n>=str.length())
        {
            return str;
        }

        char[] chars = str.toCharArray();
        reverse(chars,0,n-1);
        reverse(chars,n,str.length()-1);
        reverse(chars,0,str.length()-1);
        return new String(chars);

    }

    private void reverse(char[] chars, int i, int i1) {
        while(i<i1)
        {
            swap(chars,i++,i1--);
        }
    }

    private void swap(char[] chars, int i, int i1) {
        char t = chars[i];
        chars[i] = chars[i1];
        chars[i1] = t;
    }


}

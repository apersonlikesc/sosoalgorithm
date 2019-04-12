package nowcoder;

public class solution58 {
    public String ReverseSentence(String str) {
        int n = str.length();
        char[] chars = str.toCharArray();
        int i = 0,j=0;
        while(j<=n)
        {
            if(j==n||chars[j] == ' ')
            {
                reverse(chars,i,j-1);//将单词旋转(单词开头的char与结尾的char交换)
                i = j+1;
            }
            j++;
        }
        reverse(chars,0,n-1);//整个字符串旋转(就是开头的char与结尾的char交换)
        return new String(chars);
    }

    private void reverse(char[] chars, int i, int j) {
        while(i<j)
        {
            swap(chars,i++,j--);
        }
    }

    private void swap(char[] chars, int i, int i1) {
        char t = chars[i];
        chars[i] = chars[i1];
        chars[i1] = t;
    }


}

package nowcoder;

public class solution58_3 {
    public String LeftRotateString(String str,int n) {
        if(n>=str.length())
        {
            return  str;
        }
        StringBuffer a = new StringBuffer(str);
        StringBuffer b = new StringBuffer(str);
        StringBuffer c = new StringBuffer();

        a.delete(0,n);
        b.delete(n,str.length());
        c.append(a.toString()).append(b.toString());
        return c.toString();
    }
}

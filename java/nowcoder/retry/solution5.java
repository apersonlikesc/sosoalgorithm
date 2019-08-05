package nowcoder.retry;

public class solution5 {
    public String replaceSpace(StringBuffer str) {
        int perlength = str.length()-1;
        for(int i=0;i<=perlength;i++)
        {
            if(str.charAt(i) == ' ')
            {
                str.append("  ");
            }
        }
        int nowlength = str.length()-1;
        while(perlength>=0&&nowlength>=perlength)
        {
            if(str.charAt(perlength)==' ')
            {
                str.setCharAt(nowlength--,'0');
                str.setCharAt(nowlength--,'2');
                str.setCharAt(nowlength--,'%');
            }else{
                str.setCharAt(nowlength--,str.charAt(perlength));
            }
            perlength--;
        }

        return str.toString();
    }
}

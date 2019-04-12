package nowcoder;

import java.util.BitSet;

public class solution50_2 {
    public int FirstNotRepeatingChar2(String str) {
        BitSet bs1 = new BitSet(256);
        BitSet bs2 = new BitSet(256);
        for(char c : str.toCharArray())
        {
            if(!bs1.get(c)&&!bs2.get(c))
            {
                bs1.get(c);
            }else if(bs1.get(c)&&!bs2.get(c))
            {
                bs2.get(c);
            }
        }
        for(int i = 0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(bs1.get(c)&&!bs2.get(c))
            {
                return i;
            }
        }
        return -1;
    }

}

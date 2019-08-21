package leetcode.retry;

public class solution1108 {
    public String defangIPaddr(String address) {
//        return address.replace(".","[.]");
        return address.replaceAll("\\.","[\\.]");
//        StringBuffer s = new StringBuffer();
//        for(int i =0;i<address.length();i++)
//        {
//            if(address.charAt(i)=='.')
//            {
//                s.append("[.]");
//            }else{
//                s.append(address.substring(i,i+1));
//            }
//        }

    }
}

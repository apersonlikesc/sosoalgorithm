package nowcoder;

public class solution11 {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0)
        {
            return 0;
        }
        int l =0,h = array.length-1;
        while(l<h)
        {
            int m=l+(l+h)/2;
            if(array[m]<=array[h])//有序的
            {
                h = m;
            }else{
                l = m+1;
            }
        }
        return array[l];
    }
}

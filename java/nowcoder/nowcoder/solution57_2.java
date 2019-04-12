package nowcoder;

import java.util.ArrayList;

public class solution57_2 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        int plow = 1,phigh = 2;

        while(plow<phigh)
        {
            int cur = (phigh+plow)*(phigh-plow+1)/2;

            if(cur == sum)
            {
                ArrayList<Integer> list = new ArrayList<>();
                for(int i = plow;i<=phigh;i++)
                {
                    list.add(i);
                }
                ret.add(list);
                plow++;
            }else if(cur<sum){
                phigh++;
            }else{
                plow++;
            }
        }
        return ret;
    }
}

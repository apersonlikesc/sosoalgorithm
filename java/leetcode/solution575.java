import java.util.HashSet;

public class solution575 {
    public int distributeCandies(int[] candies)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int candie:candies)
        {
            set.add(candie);
        }

        if(set.size()>=candies.length/2)
        {
            return candies.length/2;
        }else{
            return set.size();
        }
    }
}

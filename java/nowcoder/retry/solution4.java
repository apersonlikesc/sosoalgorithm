package nowcoder.retry;

public class solution4 {
    public boolean Find(int target, int [][] array) {
        if(array==null||array.length==0||array[0].length == 0)
        {
            return false;
        }
        int rows = array.length-1;
        int cols = array[0].length-1;
        int row = 0,col = cols;
        while(row<=rows&&col>=0)
        {
            if(target < array[row][col])
            {
                col--;
            }else if(target >array[row][col])
            {
                row++;
            }else{
                return true;
            }
        }
        return false;
    }
}

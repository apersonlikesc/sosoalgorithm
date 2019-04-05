public class solution4 {
    public boolean Find(int target, int [][] array) {
        if(array==null || array.length == 0|| array[0].length == 0)
        {
            return false;
        }
        int row = array.length,cols = array[0].length;
        int r = 0,c = cols -1;
        while(r<=row-1&&c>=0)
        {
            if(target==array[r][c])
            {
                return true;
            }else if(target>array[r][c]){
                r++;
            }else{
                c--;
            }
        }
        return false;
    }
}

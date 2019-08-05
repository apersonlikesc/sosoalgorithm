package nowcoder;

public class solution12 {
    private final static int[][] next={{0,-1},{0,1},{-1,0},{1,0}};
    private int rows;
    private int cols;

    public boolean hasPath(char[] array,int rows,int cols,char[] str)
    {
        if(rows == 0|| cols==0){
            return false;
        }
        this.rows = rows;
        this.cols = cols;
        boolean[][] marked  = new boolean[rows][cols];
        char[][] matrix = bulidmatrix(array);
        for(int i = 0;i<rows;i++)
        {
            for(int j = 0;j<cols;j++)
            {
                if(backtracking(matrix,str,marked,0,i,j))
                    return true;
            }
        }
        return false;
    }

    private boolean backtracking(char[][] matrix, char[] str, boolean[][] marked, int pathlength, int r, int c) {

        if(pathlength == str.length)
        {
            return true;
        }
        if(r<0||r>=rows||c<0||c>=cols||matrix[r][c]!=str[pathlength]||marked[r][c])
        {
            return false;
        }
        marked[r][c] = true;

        for(int[] n :next)
        {
            if(backtracking(matrix,str,marked,pathlength+1,r+n[0],c+n[1]))
                return true;
        }
        marked[r][c] = false;
        return  false;
    }

    private char[][] bulidmatrix(char[] array) {
        char[][] matrix = new char[rows][cols];
        for(int i = 0,idx = 0;i<rows;i++)
        {
            for(int j = 0;j<cols;j++)
            {
                matrix[i][j] = array[idx++];
            }
        }
        return matrix;
    }
}

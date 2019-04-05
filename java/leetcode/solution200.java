public class solution200 {
    boolean[][] isVisited;
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length<=0||grid[0].length<=0)
            return 0;
        isVisited =new boolean[grid.length][grid[0].length];

        int count = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]=='1'&&!isVisited[i][j]){
                    bfs(grid,isVisited,i+1,j);
                    bfs(grid,isVisited,i-1,j);
                    bfs(grid,isVisited,i,j-1);
                    bfs(grid,isVisited,i,j+1);
                    count++;
                }
            }
        }

        return count;
    }
    private int bfs(char[][] grid,boolean[][] isVisited,int x,int y)
    {
        if(x<0||x>grid.length-1||y<0||y>grid[0].length-1||isVisited[x][y]){
            return 0;
        }
        if(grid[x][y]=='1'){
            isVisited[x][y] = true;
            bfs(grid,isVisited,x+1,y);
            bfs(grid,isVisited,x-1,y);
            bfs(grid,isVisited,x,y-1);
            bfs(grid,isVisited,x,y+1);
        }
            return 0;

    }

}

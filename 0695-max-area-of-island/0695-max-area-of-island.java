import java.util.*;
class Solution {
    static int bfs(int[][] grid,boolean[][] visited,int m,int n){
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{m,n});
        visited[m][n]=true;
        int counter=1;
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int[] dr={0,0,1,-1};
            int[] dc={1,-1,0,0};
            for(int k=0;k<4;k++){
                int nr=cur[0]+dr[k];
                int nc=cur[1]+dc[k];
                if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]==1 && !visited[nr][nc]){
                    visited[nr][nc]=true;
                    counter++;
                    q.offer(new int[]{nr,nc});
                }
            }
        }
        return counter;
    }
    static int solve(int[][] grid,int m,int n){
        boolean[][] visited=new boolean[m][n];
        int maxi=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    int cur=bfs(grid,visited,i,j);
                    maxi=Math.max(maxi,cur);
                }
            }
        }
        return maxi;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        return solve(grid,m,n);
    }
}
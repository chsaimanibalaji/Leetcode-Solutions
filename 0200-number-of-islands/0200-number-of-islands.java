import java.util.*;
class Solution {
    static void bfs(char[][] grid,boolean[][] visited,int m,int n){
        Queue<int[]> q=new LinkedList<>();
        int[] dr={0,0,-1,1};
        int[] dc={-1,1,0,0};
        q.offer(new int[] {m,n});
        visited[m][n]=true;
        while(!q.isEmpty()){
            int cur[]=q.poll();
            for(int k=0;k<4;k++){
                int nr=cur[0]+dr[k];
                int nc=cur[1]+dc[k];
                if(nr<grid.length && nc<grid[0].length && nr>=0 && nc>=0 && !visited[nr][nc] && grid[nr][nc]=='1'){
                    visited[nr][nc]=true;
                    q.offer(new int[]{nr,nc});
                }
            }
        }
    }
    static int solve(char[][] grid,int m,int n){
        boolean[][] visited=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    count++;
                    bfs(grid,visited,i,j);
                }
            }
        }
        return count;
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        return solve(grid,m,n);
    }
}
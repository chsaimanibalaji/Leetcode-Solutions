import java.util.*;
class Solution {
    static int bfs(int[][] grid,ArrayList<int[]> list){
        Queue<int[]> q=new LinkedList<>();
        for(int[] x:list){
            q.offer(new int[]{x[0],x[1]});
        }
        int time=0;
        int[] dr={0,0,-1,1};
        int[] dc={-1,1,0,0};
        while(!q.isEmpty()){
            boolean infected=false;
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] cur=q.poll();
                for(int k=0;k<4;k++){
                    int nr=cur[0]+dr[k];
                    int nc=cur[1]+dc[k];
                    if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        infected=true;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
                if(infected)time++;
        }
        return time;
    }
    static int solve(int[][] grid,int m,int n){
        ArrayList<int[]> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    list.add(new int[]{i,j});
                }
            }
        }
        int time=bfs(grid,list);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return time;
    }
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        return solve(grid,m,n);
    }
}
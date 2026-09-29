class Solution {
    public int minCostConnectPoints(int[][] points) {
        int source=0;
        int n=points.length;
        boolean visited[]=new boolean[n];
        int[] key=new int[n];
        Arrays.fill(key,Integer.MAX_VALUE);
        int[] parent=new int[n];
        key[0]=0;
        parent[0]=-1;
        for(int count=0;count<n-1;count++){
            int u=-1;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(!visited[i] && min>key[i]){
                    min=key[i];
                    u=i;
                }
            }
            if(u==-1){
                break;
            }
            visited[u]=true;
            for(int v=0;v<n;v++){
                if(!visited[v]){
                    int distance=Math.abs(points[u][0]-points[v][0])+Math.abs(points[u][1]-points[v][1]);
                    if(distance<key[v]){
                    key[v]=distance;
                    parent[v]=u;
                    }
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=key[i];
        }
        return ans;
    }
}
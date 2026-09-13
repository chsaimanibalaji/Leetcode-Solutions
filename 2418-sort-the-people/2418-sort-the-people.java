class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int[] arr=new int[heights.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        for(int i=0;i<heights.length;i++){
            for(int j=i;j<heights.length;j++){
                if(heights[i]<heights[j]){
                    int temp=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;

                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        String[] ans=new String[names.length];
        int x=0;
        while(x<ans.length){
            ans[x]=names[arr[x]];
            x++;
        }
        return ans;
    }
}
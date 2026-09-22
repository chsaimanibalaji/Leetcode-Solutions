class Solution {
    static int func(int[] arr,int hourly){
        int req=0;
        for(int i=0;i<arr.length;i++){
            req+=Math.ceil((double)arr[i]/hourly);
        }
        return req;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low=1,high=piles[piles.length-1];
        while(low<=high){
            int mid=(low+high)/2;
            int req=func(piles,mid);
            if(req>h){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}
class Solution {
    static int func(int weights[],int speed){
        int sum=0;
        int days=1;
        for(int i = 0;i < weights.length; i++) {
            if (sum + weights[i] > speed) {
                days++;
                sum = weights[i];
            } else {
                sum += weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=0,high=0;
        for(int x:weights){
            low=Math.max(low,x);
            high+=x;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(days>=func(weights,mid)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
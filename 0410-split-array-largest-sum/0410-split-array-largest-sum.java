class Solution {
    static int func(int[] nums,int cap){
        int sum=0;
        int stu=1;
        for(int i=0;i<nums.length;i++){
            if(cap>=sum+nums[i]){
                sum+=nums[i];
            }
            else{
                stu++;
                sum=nums[i];
            }
        }
        return stu;
    }
    public int splitArray(int[] nums, int k) {
        if(k>nums.length){
            return -1;
        }
        int low=nums[0];
        int high=nums[0];
        for(int i=1;i<nums.length;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(k<func(nums,mid)){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=1;
        int sum=0;
        int size=0,min_size=nums.length;
        for(int x=0;x<nums.length;x++){
            sum+=nums[x];
            if(nums[x]>=target){
                return 1;
            }
        }
        if(sum<target){
            return 0;
        }
        sum=nums[i]+nums[j];
        while(j<nums.length){
            if(sum<target){
                j++;
                if(j<nums.length){
                sum+=nums[j];
                }
            }
            while(sum>=target){
                size=j-i+1;
                min_size=Math.min(size,min_size);
                sum-=nums[i];
                i++;
            }
        }
        return min_size;
    }
}
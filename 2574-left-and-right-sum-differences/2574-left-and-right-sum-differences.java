class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum1[]=new int[nums.length];
        int sum2[]=new int[nums.length];
        sum1[0]=nums[0];
        sum2[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            sum1[i]=sum1[i-1]+nums[i];
            sum2[nums.length-1-i]=sum2[nums.length-i]+nums[nums.length-i-1];
        }
        int res[] =new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=Math.abs(sum1[i]-sum2[i]);
        }
        return res;
    }
}
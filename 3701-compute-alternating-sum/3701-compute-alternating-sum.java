class Solution {
    public int alternatingSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]*Math.pow(-1,i);
        }
        return sum;
    }
}
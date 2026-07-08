class Solution {
    public void rarray(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
       k=k%nums.length;
       int i=0,j=nums.length-1;
       while(i<j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
       }
       rarray(nums,0,k-1);
       rarray(nums,k,nums.length-1);
    }
}
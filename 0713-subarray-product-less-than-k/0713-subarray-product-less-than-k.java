/*class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=i;j<nums.length;j++){
                product*=nums[j];
                if(product<k){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}*/
class Solution{
    public int numSubarrayProductLessThanK(int[] nums, int k){
        int count=0;
        int j=0,i=0;
        int product=1;
        while(j<nums.length){
        product*=nums[j];
        while(product>=k){
            product/=nums[i];
            i++;
        }
        count+=j-i+1;
        j++;
        }
        return count;
    }
}
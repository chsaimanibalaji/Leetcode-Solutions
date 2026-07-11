class Solution {
    public int subarraySum(int[] nums, int k) {
       /*int prefix[]=new int[nums.length+1];
       int x=1,sum=0;
       prefix[0]=0;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        prefix[x++]=sum;
       }
       */
       int count=0;
       for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    count++;}
                            }}
                   return count;         
    }
}
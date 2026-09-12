import java.util.*;
class Solution {
    static int sum(int n){
        int res=0;
        while(n>0){
            res+=n%10;
            n/=10;
        }
        return res;
    }
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=sum(nums[i]);
        }
        Arrays.sort(nums);
        return nums[0];
    }
}
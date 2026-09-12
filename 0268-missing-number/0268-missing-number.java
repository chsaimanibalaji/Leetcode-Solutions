import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(!set.contains(0)){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            int x=nums[i+1];
            if(!set.contains(x-1)){
                return x-1;
            }
        }
        return nums[nums.length-1]+1;
    }
}
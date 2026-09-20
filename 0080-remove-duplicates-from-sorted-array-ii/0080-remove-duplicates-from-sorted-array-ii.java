import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
    int buffer=0,dup=0;
    int i=0,j=1;
    if(nums.length==1){
        return 1;
    }
    while(i<nums.length && j<nums.length){
        if(i<j && nums[i]==nums[j]){
            buffer++;
        }
        if(nums[j]!=nums[i]){
            buffer=0;
            i=j;
            j++;
            continue;
        }
        if(buffer>1){
            nums[j]=Integer.MAX_VALUE;
            dup++;
        }
        j++;
    }
    Arrays.sort(nums);
    return nums.length-dup;
    }
}
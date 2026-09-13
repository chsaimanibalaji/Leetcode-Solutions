import java.util.*;
class Solution {
    static int linear(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return 0;
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int x[]=nums.clone();
        Arrays.sort(x);
        for(int i=0;i<nums.length;i++){
            nums[i]=linear(x,nums[i]);
        }
        return nums ;
    }
}
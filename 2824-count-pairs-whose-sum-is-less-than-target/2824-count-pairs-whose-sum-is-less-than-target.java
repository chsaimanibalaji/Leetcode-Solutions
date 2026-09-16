import java.util.*;
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int[] arr = new int[nums.size()];
        for(int x=0;x<arr.length;x++){
            arr[x]=nums.get(x);
        }
        int i=0,j=1;
        int count=0;    
        while(i<j && j<arr.length){
            if(arr[i]+arr[j]<target){
                count++;
            }
            j++;
            if(j==arr.length){
                i++;
                j=i+1;
            }
        }
        return count;
    }
}
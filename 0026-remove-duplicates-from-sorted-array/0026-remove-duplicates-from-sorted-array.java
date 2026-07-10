import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int k=0;
        for(int x:map.keySet()){
            nums[k]=x;
            k++;
        }
        return map.size();
    }
}
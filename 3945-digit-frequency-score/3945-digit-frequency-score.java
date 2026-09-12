import java.util.*;
class Solution {
    static int[] strip(int n){
        int x=n,count=0;
        while(x>0){
            x/=10;
            count++;
        }
        int[] arr=new int[count];
        for(int i=0;i<count;i++){
            arr[i]=n%10;
            n=n/10;
        } 
        return arr;
    }
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=strip(n);
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int sum=0;
        for(int item:map.keySet()){
            sum+=item*map.get(item);
        }
        return sum;
    }
}
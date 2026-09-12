import java.util.*;
class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map_even=new HashMap<>();
        HashMap<Character,Integer> map_odd=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
               if(map_even.containsKey(s.charAt(i))){
                map_even.put(s.charAt(i),map_even.get(s.charAt(i))+1);
               } 
               else{
                map_even.put(s.charAt(i),1);
               }
            }
            else{
                if(map_odd.containsKey(s.charAt(i))){
                map_odd.put(s.charAt(i),map_odd.get(s.charAt(i))+1);
               } 
               else{
                map_odd.put(s.charAt(i),1);
               }
            }
        }
        int even_max=0,odd_max=0;
        for(char item:map_even.keySet()){
            if(map_even.get(item)>even_max){
                even_max=map_even.get(item);
            }
        }
        for(char item:map_odd.keySet()){
            if(map_odd.get(item)>odd_max){
                odd_max=map_odd.get(item);
            }
        }
        return odd_max+even_max;
    }
}
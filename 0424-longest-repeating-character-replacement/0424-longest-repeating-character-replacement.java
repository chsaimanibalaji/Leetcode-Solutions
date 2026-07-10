/*import java.util.*;
class Solution {
    public void check(HashMap<Character,Integer> map,int start,int end,String s){
        while(start<=end){
            if(map.containsKey(s.charAt(start))){
                map.put(s.charAt(start),map.get(s.charAt(start))+1);
            }
            else{
                map.put(s.charAt(start),1);
            }
            start++;
        }
    }
    public int characterReplacement(String s, int k) {
        int i=0,j=0;
        int ans=0;
        while(j<s.length()){
            HashMap<Character,Integer> map=new HashMap<>();
            int max_freq=0;
            check(map,i,j,s);
            for(char x:map.keySet()){
                max_freq=Math.max(map.get(x),max_freq);
            }
            int window=j-i+1;
            if(max_freq+k>=window){
                ans=Math.max(ans,window);
                j++;
            }
            if(max_freq+k<window){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
                    }
        return ans;
    }
}
*/
import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0, j = 0;
        int ans = 0;
        int maxFreq = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(j)));
            while ((j - i + 1) - maxFreq > k) {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                if (map.get(s.charAt(i)) == 0)
                    map.remove(s.charAt(i));
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }
}
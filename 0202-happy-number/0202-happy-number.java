import java.util.*;
class Solution {
    static int strip(int x){
        int square=0;
        while(x>0){
            int y=x%10;
            square=square+(y*y);
            x=x/10;
        }
        return square;
    }
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
            while(!set.contains(n)){
                set.add(n);
                int next=strip(n);
                if(strip(n)==1){
                    return true;
                }
                n=next;
            }
        return false;
    }
}
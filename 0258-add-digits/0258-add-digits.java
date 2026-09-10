import java.util.*;
class Solution {
    static int add(int n){
        int num=0;
        while(n>0){
            num+=n%10;
            n=n/10;
        }
        return num;
    }
    static boolean checkdigits(int n){
        if(n/10<=0){
            return true;
        }
        return false;
    }
    public int addDigits(int num) {
        Set<Integer> set=new HashSet<>();
        while(!set.contains(num)){
            int x=add(num);
            if(checkdigits(x)){
                return x;
            }
            num=x;
        }
        return -1;
    }
}
import java.util.*;
class Solution {
    public int reverse(int x) {
        long num=x;
        if(x>=Math.pow(2,31)-1 || x<=-Math.pow(2,31)){
            return 0;
        }
        long sol=0;
        boolean sign=true;
        if(num<0){
            sign=false;
            num=-(num);
        }
        while(num>0){
            sol=sol*10+(num%10);
            num/=10;
        }
        if(sol>Integer.MAX_VALUE || sol<Integer.MIN_VALUE){
            return 0;
        }
        if(!sign){
            return -(int)sol;
        }
        return (int)sol;
    }
}
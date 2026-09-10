class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        if(x<0){
            return false;
        }
        else{
            int num=0;
            while(x>0){
                int z=x%10;
                num=num*10+z;
                x=x/10;
            }
            if(num==y){
                return true;
            }
        }
        return false;
    }
}
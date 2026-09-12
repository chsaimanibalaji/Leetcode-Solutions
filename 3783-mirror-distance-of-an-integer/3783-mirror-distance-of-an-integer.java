class Solution {
    static int reverse(int n){
        int number=0;
        while(n>0){
            number=number*10+(n%10);
            n=n/10;
        }
        return number;
    }
    public int mirrorDistance(int n) {
        int num=reverse(n);
        return Math.abs(num-n);
    }
}
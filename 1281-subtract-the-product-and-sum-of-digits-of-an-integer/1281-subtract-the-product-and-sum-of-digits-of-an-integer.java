class Solution {
    static int pro(int n){
        int p=1;
        while(n>0){
            p*=n%10;
            n=n/10;
        }
        return p;
    }
    static int sum(int n){
        int s=0;
        while(n>0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
    public int subtractProductAndSum(int n) {
        return pro(n)-sum(n);
    }
}
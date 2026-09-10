/*class Solution {
    public int[] plusOne(int[] digits) {
        int i=0,x=digits.length;
        int num=0;
        while(i<x){
            num+=digits[i]*Math.pow(10,x-i-1);
            i++;
        }
        num+=1;
        int dummy=num,count=0;
        while(dummy>0){
            count++;
            dummy=dummy/10;
        }
        int[] arr=new int[count];
        for(int j=0;j<arr.length;j++){
            arr[arr.length-j-1]=num%10;
            num/=10;
        }
        return arr;
    }
}
*/
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }
}

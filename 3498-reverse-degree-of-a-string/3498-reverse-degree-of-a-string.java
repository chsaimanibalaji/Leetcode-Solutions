class Solution {
    static int calculate(char x){
        return (int)26-(x-'a');
    }
    public int reverseDegree(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int pro=0;
        while(i<arr.length){
            pro+=calculate(arr[i])*(i+1);
            i++;
        }
        return pro;
    }
}
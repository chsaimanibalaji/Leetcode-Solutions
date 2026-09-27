import java.util.*;
class Solution {
    static String reverse(String s){
        String a="";
        for(int i=s.length()-1;i>=0;i--){
            a+=s.charAt(i);
        }
        return a;
    }
    public String reverseParentheses(String s) {
        String curr="";
        Stack<String> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(curr);
                curr="";
            }
            else if(s.charAt(i)==')'){
                curr=stack.pop()+reverse(curr);
            }
            else{
                curr+=s.charAt(i);
            }
        }
        return curr;
    }
}
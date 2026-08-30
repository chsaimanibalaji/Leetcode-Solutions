/*import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        int i=0;
        int flag=0;
        while(i<s.length()){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
                flag++;
            }
            if(flag==0){
                return false;
            }
            char x=stack.peek();
            if(x=='(' && s.charAt(i)==')'){
                char p=stack.pop();
                flag--;
            }
            if(x=='{' && s.charAt(i)=='}'){
                char p=stack.pop();
                flag--;
            }
            if(x=='[' && s.charAt(i)==']'){
                char p=stack.pop();
                flag--;
            }
            i++;
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }
}*/
class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();   
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((c == ')' && top == '(') ||
                    (c == '}' && top == '{') ||
                    (c == ']' && top == '[')) {
                    stack.pop(); 
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
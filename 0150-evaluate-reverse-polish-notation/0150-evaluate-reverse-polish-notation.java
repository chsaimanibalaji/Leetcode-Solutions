class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(!(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/"))){
                stack.push(Integer.valueOf(tokens[i]));
            }
            else if(tokens[i].equals("+")){
                int x=stack.pop();
                int y=stack.pop();
                stack.push(x+y);
            }
            else if(tokens[i].equals("-")){
                int x=stack.pop();
                int y=stack.pop();
                stack.push(y-x);
            }
            else if(tokens[i].equals("*")){
                int x=stack.pop();
                int y=stack.pop();
                stack.push(x*y);
            }
            else if(tokens[i].equals("/")){
                int x=stack.pop();
                int y=stack.pop();
                stack.push(y/x);
            }
        }
        return stack.peek();
    }
}
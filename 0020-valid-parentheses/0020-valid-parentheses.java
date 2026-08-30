class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // 1. If it's an opening bracket, push it
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // 2. If it's a closing bracket
            else {
                // If stack is empty, there's no matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }
                
                // Check if top of stack matches the current closing bracket
                char top = stack.peek();
                if ((c == ')' && top == '(') ||
                    (c == '}' && top == '{') ||
                    (c == ']' && top == '[')) {
                    stack.pop(); // Valid match!
                } else {
                    return false; // Mismatched types (e.g., top is '(', but c is ']')
                }
            }
        }
        
        // If stack is empty, all brackets were properly matched
        return stack.isEmpty();
    }
}
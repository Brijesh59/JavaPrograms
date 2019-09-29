/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Input: "()"
Output: true

Input: "()[]{}"
Output: true

Input: "(]"
Output: false

Input: "([)]"
Output: false

Input: "{[]}"
Output: true

NOTE: This is Leetcode Problem 20. [ https://leetcode.com/problems/valid-parentheses/ ]
*/


class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else if(c == ')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }
            else if(c == ']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }
            else if(c == '}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}

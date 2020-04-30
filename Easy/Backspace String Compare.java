/*
844. Backspace String Compare

Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
Note that after backspacing an empty text, the text will continue empty.

Example 1:
Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
*/





class Solution {
    public boolean backspaceCompare(String S, String T) {
       return helper(S).equals(helper(T));
        
        
    }
    public String helper(String s){
        Stack<Character> S = new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c!='#'){
                S.push(c);
            }
            else if(!S.empty()){
                S.pop();
            }
        }
        return String.valueOf(S); 
       
       
    }
}
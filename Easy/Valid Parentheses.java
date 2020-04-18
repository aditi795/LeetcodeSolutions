//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

//An input string is valid if:

//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Note that an empty string is also considered valid.


class Solution {
    public boolean isValid(String s) {
         Stack<Character> st = new Stack<Character>();
        char[] ch = s.toCharArray();
         for(int i=0;i<s.length();i++){
             if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[') {
                 st.push(ch[i]); 
                 
             }
             if (ch[i] == '}' || ch[i] == ')' || ch[i] == ']') {
                 if(st.isEmpty()){
                     return false;
                 }
                 if(!isMatchingPair(st.pop(),ch[i])){
                     return false;
                 }
                 
             }
         }
         if(!st.isEmpty()){
             return false;
         }
        return true;
    }
    
    static boolean isMatchingPair(char character1, char character2) 
    { 
       if (character1 == '(' && character2 == ')') 
         return true; 
       else if (character1 == '{' && character2 == '}') 
         return true; 
       else if (character1 == '[' && character2 == ']') 
         return true; 
       else
         return false; 
    }
}
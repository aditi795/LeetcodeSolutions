/* 65. Valid Number
A valid number can be split up into these components (in order):

A decimal number or an integer.
(Optional) An 'e' or 'E', followed by an integer.
A decimal number can be split up into these components (in order):

(Optional) A sign character (either '+' or '-').
One of the following formats:
At least one digit, followed by a dot '.'.
At least one digit, followed by a dot '.', followed by at least one digit.
A dot '.', followed by at least one digit.
An integer can be split up into these components (in order):

(Optional) A sign character (either '+' or '-').
At least one digit.
For example, all the following are valid numbers: ["2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789"], while the following are not valid numbers: ["abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53"].

Given a string s, return true if s is a valid number.


Example 1:
Input: s = "0"
Output: true

*/


class Solution {
    public boolean isNumber(String s) {
        /*Solution by regex 
          return s.trim().matches("[+-]?(\\d+(\\.\\d*)?|\\.\\d+)([eE][+-]?\\d+)?");
        */

        //Iterative solution
        if(s==null || s.length()==0){
            return false;
        }
        boolean number  = false;
        boolean sign  = false;
        boolean decimal  = false;
        boolean expression  = false;
        int l = 0;
        int h = s.length()-1;
        while(l<=h){
            char c = s.charAt(l++);
            if(c == '+' || c == '-'){
                if(number || sign){
                    return false;
                }
                sign = true;
            }
            else if(c >= '0' && c<='9'){
                number = true;
            }
            else if(c == '.'){
                if(decimal || expression){
                    return false;
                }
                decimal = true;
                sign = true;
            }
            else if(c == 'e' || c == 'E'){
                if(expression || !number){
                    return false;
                }
                expression = true;
                sign = false;
                number = false;
            }else{
                return false;
            }
        }
         return number;    
        
}
}
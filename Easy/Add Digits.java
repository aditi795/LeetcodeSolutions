/*
258. Add Digits

Example:
Input: 38
Output: 2 
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
             Since 2 has only one digit, return it.
*/

class Solution {
    public int addDigits(int num) {
        if(num>=10){
           num = addDigits(num/10 + num%10);
        }
        return num;
        
    }
    
}
/*
476. Number Complement
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Example 1:

Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
*/

class Solution {
    public int findComplement(int num) {
        String bin = Integer.toBinaryString(num);
        String cStr = "";
        for(int i=0; i<bin.length(); i++){
            cStr+=flip(bin.charAt(i));
        }
        return Integer.parseInt(cStr,2);
        
    }
    public char flip(char c){
        return (c=='0')?'1':'0';
    }
    
}
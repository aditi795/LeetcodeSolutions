/* 409. Longest Palindrome
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
*/


class Solution {
  public int longestPalindrome(String s) {
      HashMap<Character, Integer> count = new HashMap<Character, Integer>();
      for(int i=0; i<s.length(); i++){
          char c = s.charAt(i);
          if(count.containsKey(c)){
              count.put(c,count.getOrDefault(c, 0)+1);
          }
          else{
              count.put(c, 1);
          }
      }
      int len =0;
      boolean firstOdd=false;
      
      for(char key : count.keySet()){
          int val = count.get(key);
           if(count.size() ==1){
            return count.get(key);
          }
          else{
              if(val%2==0){
              len+=val;
              }
              else{
                 if(firstOdd==false){
                  len+= val ;
                  firstOdd=true;
              }
              else{
                  len+= (val-1);
              } 
              }
          }
      }
      return len;
      
  }
}


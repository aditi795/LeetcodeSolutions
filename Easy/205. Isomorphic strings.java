/*

205. Isomorphic strings

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"
Output: true

*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
       char[] s1 = s.toCharArray();
    char[] t1 = t.toCharArray();
        Map<Character, Character> map = new HashMap<Character, Character>();
        
        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s1[i]) && !map.containsValue(t1[i])){
                map.put(s1[i], t1[i]);
            }
            if((!map.containsKey(s1[i]) && map.containsValue(t1[i]) || !map.get(s1[i]).equals(t1[i]))) 
			 {                                                                                                         return false;
             }   
        }
        return true;
        
        
    }
}
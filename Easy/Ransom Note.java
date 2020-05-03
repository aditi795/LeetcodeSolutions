/*
383. Ransom Note
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.
canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
*/
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       if(ransomNote.length()==0)	    return true;
        if(magazine.length()==0)    return false;
        
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0; i<ransomNote.length();i++){
                hm.put(ransomNote.charAt(i),                                                           hm.getOrDefault(ransomNote.charAt(i),0) + 1);
        }
        
        for(int i=0; i<magazine.length();i++){
            char c = magazine.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)-1);    
                if(hm.get(c)==0) hm.remove(c);
			}
            if(hm.isEmpty()) {
                return true;
            }
		}
		return false;
    }
}
//Time Complexity : O(n+m)
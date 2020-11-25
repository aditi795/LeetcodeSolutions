49. Group Anagrams

Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> m = new HashMap<String, List>();
        for(String s : strs){ //O(N)
            char[] ca = s.toCharArray();
            Arrays.sort(ca); // O(KlogK) k is the max length of string in strs
            String key = String.valueOf(ca);
            if(!m.containsKey(key)) m.put(key, new ArrayList());
            m.get(key).add(s);
        }
        return new ArrayList(m.values());
    }
}
/*
208. Implement Trie (Prefix Tree)

Implement a trie with insert, search, and startsWith methods.

Example:

Trie trie = new Trie();

trie.insert("apple");
trie.search("apple");   // returns true
trie.search("app");     // returns false
trie.startsWith("app"); // returns true
trie.insert("app");   
trie.search("app");     // returns true
*/


class TrieNode{
    HashMap<Character, TrieNode> node = new HashMap<Character, TrieNode>();
    boolean isEndofWord;         
}

class Trie {
    TrieNode  root;
    /** Initialize your data structure here. */
    public Trie() {
      root = new TrieNode();
}
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode curr = root;
        for(char c: word.toCharArray()){
            curr.node.putIfAbsent(c, new TrieNode());
            curr=curr.node.get(c);
        }
        curr.isEndofWord=true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode curr = root;
        for(char c: word.toCharArray()){
            if(!curr.node.containsKey(c)){
                return false;
            }
            curr=curr.node.get(c);
            //curr.isEndofWord=true;
        }
        return curr.isEndofWord;
        
}
    /** Returns if there is any word in the trie that starts with the given prefix. */
public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for(char c : prefix.toCharArray()){
            if(!curr.node.containsKey(c)){
                return false;
            }
            curr=curr.node.get(c);
        }
        return true;
    }
     
    
    
}

 

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
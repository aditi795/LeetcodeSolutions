class Solution {
    public String restoreString(String s, int[] indices) {
        char [] tString = new char[indices.length];
        for(int i=0; i<s.length(); i++){
            tString[indices[i]]=s.charAt(i);
        }
       
       return new String(tString); 
    }
}
//Find Smallest Letter Greater Than Target

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       int left=0; int p = 0; 
       int right = letters.length;
       while(left<right){
           p = left+(right-left)/2;
           if(letters[p] <= target) left = p + 1;
           else right = p;
        }
        return letters[left % letters.length];
       }
}
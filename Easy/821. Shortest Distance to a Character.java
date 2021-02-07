/* 
821. Shortest Distance to a Character
Given a string s and a character c that occurs in s, return an array of integers answer
where answer.length == s.length and answer[i] is the shortest distance from s[i] to the character c in s.

Example 1:

Input: s = "loveleetcode", c = "e"
Output: [3,2,1,0,1,0,0,1,2,2,1,0]
*/

class Solution {
    public int[] shortestToChar(String s, char c) {
        int len = s.length();
        int[] leftDis = new int[len];
        int[] rightDis =new int[len];
        
        Arrays.fill(leftDis, Integer.MAX_VALUE);
        Arrays.fill(rightDis, Integer.MAX_VALUE);
        
        int runningDis = Integer.MAX_VALUE;
        for(int i=0; i<len; i++){
            if(s.charAt(i) == c){
                runningDis = 0;
                rightDis[i] = runningDis;
            }   
            else{
                if(runningDis != Integer.MAX_VALUE) {
                    runningDis++;
                    rightDis[i] = runningDis;
                }
            }
        }
        
        runningDis = Integer.MAX_VALUE;
        for(int i=len-1; i>=0; i--){
            if(s.charAt(i) == c){
                runningDis = 0;
                leftDis[i] = runningDis;
            } else{

                if(runningDis != Integer.MAX_VALUE) {
                    runningDis++;
                    leftDis[i] = runningDis;
                }
            }
        }
        
        int[] res = new int[len];
        for(int i=0;i<len;i++){
            res[i] = Math.min(rightDis[i], leftDis[i]);
        }
        return res;       
    }
}

// TC : O(n)
// SC: O(n)
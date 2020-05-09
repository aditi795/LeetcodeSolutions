/*
367. Valid Perfect Square
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.
Example 1:

Input: 16
Output: true
*/
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0 || num==1) return true;
        //Linear Search
       /* long i=2;
        while(i*i<=num){
            if((i*i)==num){
                return true;
            }
            i++;
        }
        return false;
        */

        //Binary Search
        long l=1;
        long h=num/2;
        while(l<=h){
            long m=l+(h-l)/2;
            if(m*m==num){
                return true;
            }
            else if(m*m>num){
                h=m-1;
            }
            else{
                l=m+1;
            }
            
        }
        return false;
        
        
        
    }
}
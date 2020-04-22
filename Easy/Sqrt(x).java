/*Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
*/

class Solution {
    public int mySqrt(int x) {
       //Linear Search method
        /* long i=0;
        while((i*i)<x){
            if((i*i)==x || (i+1)*(i+1)>x){
                return (int)i;
            }
            i++;
        }
        return (int)i; */
        //Binary search method
        if (x == 0 || x == 1) return x;
        int l=1;
        int h=x/2;
        while(l<=h){
            int m = l+(h-l)/2;
            int r = x/m;
            if(r==m){
                return m;
            }
            else if(r<m){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return h;
    }
}
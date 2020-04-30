/*
509. Fibonacci Number
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.
Given N, calculate F(N).

Example 1:
Input: 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

*/

class Solution {
    public int fib(int N) {
        if(N<=1){
            return N;
        }
        int[] fibo = new int[N+1];
        fibo[1]=1;
        for(int i=2; i<N+1; i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        return fibo[N];
    }
}
//Time Complexity  : O(n)
//Space Complexity : O(1)

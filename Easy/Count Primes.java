/*
204. Count Primes
Count the number of prime numbers less than a non-negative number, n.
 */

//Using Sieve of Eratosthenes algorithm

class Solution {
    public int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        int sqrt=(int)Math.sqrt(n);
        
        for(int p=2;p<=sqrt;p++){
            if(isPrime[p]){
                for(int i=p*p;i<n;i=i+p){
                    isPrime[i]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;
    }
}
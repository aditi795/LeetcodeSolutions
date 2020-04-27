/*
977. Squares of a Sorted Array
Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

Example 1:
Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
*/
class Solution {
    public int[] sortedSquares(int[] A) {
        /*for(int i=0;i<A.length;i++){
            A[i]=A[i]*A[i];
        }
        Arrays.sort(A);    
        return A; 
        
        O(nlogn)
        
        */  
        
        //In O(n)
        int n = A.length;
        int j=0;
        int k=0;
        int a[] = new int[n];
        while(j<n && A[j]<0 ){
            j++;
        }
        int i=j-1;
        while (i >= 0 && j < n) {
            if(A[i]*A[i]<A[j]*A[j]){
                a[k++]=A[i]*A[i];
                i--;
            }
            else{
                a[k++]=A[j]*A[j];
                j++;
            }
        }
        while(i>=0){
            a[k++]=A[i]*A[i];
            i--;
        }
        
        while(j<n){
            a[k++]=A[j]*A[j];
            j++;
        }
        return a;
    }
}
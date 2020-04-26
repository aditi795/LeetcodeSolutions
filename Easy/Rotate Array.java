/*
189. Rotate Array
Given an array, rotate the array to the right by k steps, where k is non-negative. 
Example 1:

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]    
*/

class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    
    }
    public int[] reverse(int nums[], int start, int end){
         while(start<end){
            int temp=0;
            temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
    }
    
}

//Time Complexity: O(n). n elements are reversed a total of three times.
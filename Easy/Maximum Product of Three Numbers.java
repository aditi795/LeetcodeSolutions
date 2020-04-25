/*
628. Maximum Product of Three Numbers

Given an integer array, find three numbers whose product is maximum and output the maximum product.

Example 1:
Input: [1,2,3]
Output: 6
*/

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
            return Math.max((nums[n]*nums[n-1]*nums[n-2]),(nums[0]*nums[1]*nums[n]));
        
        
    }
}
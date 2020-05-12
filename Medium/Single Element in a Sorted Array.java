540. Single Element in a Sorted Array

You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. 
Find this single element that appears only once.

Example 1:

Input: [1,1,2,3,3,4,4,8,8]
Output: 2


class Solution {
    public int singleNonDuplicate(int[] nums) {
        //int i=0;
        if(nums.length==1) return nums[0]; 
        if(nums[0]!=nums[1]) return nums[0];
        int n=nums.length;
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        for(int i = 1; i<nums.length-1; i++){
            if(nums[i-1]!=nums[i] && nums[i]!=nums[i+1]) return nums[i];
        }
        return -1;
        
    }
}

 
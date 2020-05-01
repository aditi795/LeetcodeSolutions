/*
34. Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].
Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int[] res = {-1,-1};
        if (nums.length == 0)
		    return res;
        
        //first occurance
        while(left<right){
            int p=left+(right-left)/2;
            if(nums[p]>=target){
                right=p;             
            }
            else {
                left=p+1;
            }
        }
        
        if(nums[right]==target){
            res[0]=right;
        }
        //second occurance
        left=0;
        right=nums.length-1;    
        while(left<right){
            int mid=left+(right-left+1)/2;
            if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid;
            }
            
        }
        if(nums[right]==target){
                res[1]=right;
            }
        return res;
        
    }
}

//Time complexity - O(log n)
/* You are a professional robber planning to rob houses along a street. 
Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses 
have security system connected and it will automatically contact the police if two adjacent houses were broken 
into on the same night.
Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
*/

class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int mStorage[] = new int[nums.length]; //To store money to be robbed
        mStorage[0] = nums[0];
        mStorage[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            mStorage[i]=Math.max(nums[i]+mStorage[i-2],mStorage[i-1]);
        }
        return mStorage[nums.length-1];
    }
}
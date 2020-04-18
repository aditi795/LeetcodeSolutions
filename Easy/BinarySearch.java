//Binary Search

class Solution {
    public int search(int[] nums, int target) {
        int left=0; int p = 0; 
        int right = nums.length-1;
        while(left<=right){
            p = left + (right-left)/2;
            if(target==nums[p]){
                return p;
            }
            if(target<nums[p]){
               right = right -1; 
            }
            else{
                left=left+1;
            }
        }
        return -1;
    }
}

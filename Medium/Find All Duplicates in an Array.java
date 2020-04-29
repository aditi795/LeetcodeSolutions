/*
442. Find All Duplicates in an Array
Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
Find all the elements that appear twice in this array.
Could you do it without extra space and in O(n) runtime?

Example:
Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]

*/
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        /* Using extra space
        HashSet<Integer> uniq = new HashSet<Integer>();
        List<Integer> dups = new ArrayList<Integer>();
        for(int num : nums){
            if(uniq.contains(num)){
                dups.add(num);
            }
            else{
                uniq.add(num);
            }
        }
        return dups;
        */
        
        //O(n)
        List<Integer> dups = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i]);
            if(nums[index-1]<0){
                dups.add(index);
            }
            else{
                nums[index-1]=-1*nums[index-1];
            }
        }
        return dups;
        
    }
}
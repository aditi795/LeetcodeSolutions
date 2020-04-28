/*
287. Find the Duplicate Number
Given an array nums containing n + 1 integers where each integer is 
between 1 and n (inclusive), prove that at least one duplicate number 
must exist. Assume that there is only one duplicate number, find the 
duplicate one.
*/

class Solution {
    public int findDuplicate(int[] nums) {
        //O(n) - Using HashSet
        Set<Integer> dup = new HashSet<Integer>();
        for (int num : nums) {
            if (dup.contains(num)) {
                return num;
            }
            dup.add(num);
        }

        return -1;

        //Using HashMap
        /* HashMap<Integer,Integer> dup = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++){
              dup.put(nums[i],dup.getOrDefault(nums[i],0)+1);
            }
        for (Map.Entry<Integer,Integer> entry : dup.entrySet()) {
		    if(entry.getValue()>1){
                return entry.getKey();
            }
		}
        return 0;
        */
    }
}
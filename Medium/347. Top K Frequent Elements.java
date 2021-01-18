/*
347. Top K Frequent Elements
Given a non-empty array of integers, return the k most frequent elements.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
*/





class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==k){
            return nums;
        }
        
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int i: nums) {
          count.put(i, count.getOrDefault(i, 0) + 1);
        }
        
         PriorityQueue<Integer> kFreq = new PriorityQueue<>((n1, n2) -> count.get(n1) - count.get(n2));
        
        for(int i:count.keySet()){
            kFreq.add(i);
            if(kFreq.size()>k){
                kFreq.poll();
            }    
        }
        
        int[] topK = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            topK[i] = kFreq.poll();
        }
        return topK;
        
    }
}
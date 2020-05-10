/*
215. Kth Largest Element in an Array

Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

Example 1:

Input: [3,2,1,5,6,4] and k = 2
Output: 5
*/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        /*
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<nums.length;i++){
            pq.add(nums[i]);
        }
        int k1=1;
        while(k1!=k){
            pq.poll();
            k1++;
        }
        return pq.peek();
        */
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int el : nums) {
                    pq.add(el);
                    if (pq.size() > k) {
                        pq.poll();
                    }
                }

                return pq.poll();
            }
    
}
/* 350. Intersection of Two Arrays II
Given two arrays, write a function to compute their intersection.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int k=0;
        for(int i=0;i<nums1.length;i++){
            hm.put(nums1[i], hm.getOrDefault(nums1[i],0) + 1 );
        }
        for(int j=0;j<nums2.length;j++){
            if(hm.containsKey(nums2[j]) && hm.get(nums2[j])>0){
                nums1[k] = nums2[j];
                k++;
            }
            hm.put(nums2[j], hm.getOrDefault(nums2[j], 0)-1);
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
}
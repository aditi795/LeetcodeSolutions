/* 349. Intersection of Two Arrays
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
*/

class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
      int k=0;
      HashSet<Integer> n1 = new HashSet<Integer>();
      HashSet<Integer> n2 = new HashSet<Integer>();
      for(int i : nums1){
          n1.add(i);
      }
      for(int j : nums2){
          n2.add(j);
      }
       
      n1.retainAll(n2);
      int[] res = new int[n1.size()];
      for(int i : n1){
          res[k++]=i;
      }
      return res;
  }
}
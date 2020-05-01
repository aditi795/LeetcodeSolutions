/*
1394. Find Lucky Integer in an Array
Given an array of integers arr, a lucky integer is an integer which has a frequency in the array equal to its 
value.
Return a lucky integer in the array. If there are multiple lucky integers return the largest of them. 
If there is no lucky integer return -1.
*/

class Solution {
    public int findLucky(int[] arr) {
       HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
       for(int i=0; i<arr.length; i++){
           hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
       }
       int maxLucky =-1;
       for(Map.Entry<Integer,Integer> element : hm.entrySet()){
           if(element.getKey()==(element.getValue())){
               int result = element.getKey();
               maxLucky = Math.max(result , maxLucky);   
           }
       } 
       return maxLucky;
    }
}

//Time Complexity: O(n)
//How Many Numbers Are Smaller Than the Current Number

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int c=0;
        int[] tmpArray = nums.clone();
        Arrays.sort(tmpArray);
        int[] result = new int[tmpArray.length];
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(tmpArray[i])){
                hm.put(tmpArray[i], i);
                if(hm.containsKey(nums[c])){
                    result[c] = hm.get(nums[c]);
                    c++;
                }
            }
        }
        for (int x = c; x < nums.length; x++) {
            result[x] = hm.get(nums[x]);
        }
        return result;
    }
}
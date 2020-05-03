/*
1046. Last Stone Weight

We have a collection of stones, each stone has a positive integer weight.

Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:

If x == y, both stones are totally destroyed;
If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
*/

class Solution {
    public int lastStoneWeight(int[] stones) {
        //ArrayList<Integer> arr = new ArrayList<Integer>(); 
        Arrays.sort(stones);
        int i=stones.length-1;
        
        while(i>0){
            if(stones[i]==0){
                return 0;
        }
            if(stones[i-1]==0){
                return stones[i];
            }
            stones[i]=stones[i]-stones[i-1];
            stones[i-1]=0;
            
            Arrays.sort(stones);
            //i--;
        }
        return stones[i];
    }
}
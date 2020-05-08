/*
232. Check If It Is a Straight Line

You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. 
Check if these points make a straight line in the XY plane. 

Example 1:

Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true
*/

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length<2){
            return false;
        }
        float first = slope(coordinates[0], coordinates[1]);
        for(int i=2;i<coordinates.length;i++){
            if(slope(coordinates[0],coordinates[i])!=first){
                return false;
            }
        }
        return true;
    }
    
    public float slope(int[] c1, int[] c2){
        return (float)(c2[1]-c1[1])/(c2[0]-c1[0]);
        
    }
}

 
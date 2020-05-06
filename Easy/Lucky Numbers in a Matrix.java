/*
1380. Lucky Numbers in a Matrix
Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
A lucky number is an element of the matrix such that it is the minimum element in its row and 
maximum in its column.

Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column
*/

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        int max=0;
        int index=0;
        for(int row=0; row<matrix.length; row++){
            int min=matrix[row][0];
            for(int col=0; col<matrix[0].length; col++){
                if(matrix[row][col]<min){
                    min=matrix[row][col];
                    index=col;
                }
            }
            max=matrix[row][index];
            for(int k=0;k<matrix.length;k++){
                if(matrix[k][index]>max){
                    max=matrix[k][index];
                }
            }
            if(max==min){
                res.add(max);
                return res;
            }
            
        }
        return res;
    }
}

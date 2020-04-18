//PLUS ONE
//Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
//The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

class Solution {
    public int[] plusOne(int[] digits) {
        int l=digits.length-1;
        if(digits[l]<9){
            digits[l]=digits[l]+1;
            return digits;
        }
        else {   
            boolean nonNineExists = false;
            int i = 0;
            for(i=l;i>=0;i--){
                 if (digits[i] == 9) { 
                    digits[i] = 0;
                }
                else{
                    nonNineExists = true;
                    digits[i] = digits[i] + 1;
                    return digits;
                }
            }
       
            int[] output = new int[digits.length+1];
            if(!nonNineExists){
                 output[0] = 1;
            }  
            return output;
        }
    }
}
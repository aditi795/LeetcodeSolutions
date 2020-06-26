/*
You are given a string representing an attendance record for a student. The record only contains the following three characters:
'A' : Absent.
'L' : Late.
'P' : Present.
A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).
You need to return whether the student could be rewarded according to his attendance record.

Example 1:
Input: "PPALLP"
Output: True
*/




class Solution {
    public boolean checkRecord(String s) {
        int c=0;
        int c2=0;
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)=='A'){
                c++;
            }
            else if(s.charAt(i)=='L'){
                c2++;
            }
            
             if(c > 1) return false;
            if(c2 > 2) return false;
            
            if(s.charAt(i) != 'L'){
                c2 = 0;
            
        }
        }
        return true;
    }
}
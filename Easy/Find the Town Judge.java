/*
997. Find the Town Judge

In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.

If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.
*/



class Solution {
    public int findJudge(int N, int[][] trust) {
        if(N<2){
            return N;
        }
        if(trust.length==1){
            return trust[0][1];
        }
        int[] trustFactor= new int[N+1];
        
        for(int[] i  : trust)
        {
            trustFactor[i[0]]--;
            trustFactor[i[1]]++;
                
        }
        for(int i=0; i<trustFactor.length; i++ ){
            if(trustFactor[i]==N-1){
                return i;
            }
        }
        return -1;
    }
}
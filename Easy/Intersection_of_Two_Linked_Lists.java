//Intersection of Two Linked Lists

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode ptrA = headA, ptrB;
       while(ptrA!=null){
           for(ptrB = headB; ptrB != null; ptrB = ptrB.next){
               if(ptrA == ptrB){
                   return ptrA;
                   }
           }
           ptrA=ptrA.next;
       } 
        return null;
    }
}
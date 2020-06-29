/*24. Swap Nodes in Pairs
Given a linked list, swap every two adjacent nodes and return its head.
You may not modify the values in the list's nodes, only nodes itself may be changed.

Example:
Given 1->2->3->4, you should return the list as 2->1->4->3.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode swapPairs(ListNode head) {
      if(head==null || head.next ==null){
          return head;
      }
      ListNode dummy = new ListNode(-1);
      dummy.next = head;
      ListNode prev = dummy;
      ListNode curr = head;
      while(curr!=null && curr.next!=null){
          ListNode temp = curr.next;
          curr.next= temp.next;
          temp.next = curr;
          prev.next= temp;
          
          prev=curr;
          curr=curr.next;
      }
      return dummy.next;
  }
  
}
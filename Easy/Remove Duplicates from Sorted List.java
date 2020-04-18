//Remove Duplicates from Sorted List
//Given a sorted linked list, delete all duplicates such that each element appear only once.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.val==curr.next.val){
                curr.next=curr.next.next;
            }else{
            curr=curr.next;
            }
        }
        return head;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode ptr;
        ptr = temp;
        while(ptr.next!=null){
            if(ptr.next.val == val){
                ptr.next = ptr.next.next;
            }
            else {
                ptr = ptr.next;
            }
        }
        return temp.next;
        }
    
}
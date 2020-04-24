/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fastN = head;
        ListNode slowN = head;
        while(fastN!=null && fastN.next!=null){
            fastN=fastN.next.next;
            slowN=slowN.next;
        }
        return slowN;
    }
}
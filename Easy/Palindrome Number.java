/* 234. Palindrome Linked List
Given a singly linked list, determine if it is a palindrome.
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode midList = findMidList(head); 
        ListNode head2 = reverseList(midList.next);
        midList.next = null;
        while(head!=null && head2!=null){
            if(head.val!=head2.val){
                return false;
            }
            head=head.next;
            head2=head2.next;
        }
        return true;
       
    }
    public ListNode findMidList(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
     
         while (fast != null && fast.next != null) {
             slow = slow.next;
             fast = fast.next.next;
         }

    return slow;
    }
    
    public ListNode reverseList(ListNode head){
    ListNode prev = null;
    ListNode curr = head;
    while(curr!=null){
        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
    }
    return prev;
    }
     
}

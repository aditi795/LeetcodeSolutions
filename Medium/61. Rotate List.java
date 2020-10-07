/*

//61. Rotate List
Given a linked list, rotate the list to the right by k places, where k is non-negative.

Example 1:

Input: 1->2->3->4->5->NULL, k = 2
Output: 4->5->1->2->3->NULL
Explanation:
rotate 1 steps to the right: 5->1->2->3->4->NULL
rotate 2 steps to the right: 4->5->1->2->3->NULL

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
    public ListNode rotateRight(ListNode head, int k) {
          int listSize = 0;
        ListNode curr = head;
        while(curr.next!=null){
            listSize++;
        }
        
        if (k > listSize) {
            k = k % listSize;
        }
        ListNode tempHead = head;
        ListNode prev = head;
        while(k>0){
          while (tempHead.next != null) {
              prev= tempHead;
              tempHead=tempHead.next;
          }
            tempHead.next = head;
            head = tempHead;
            k--;
        }
        
        return tempHead;
    }
}
/*
Problem: Reverse Linked List
Platform: LeetCode
Difficulty: Easy
https://leetcode.com/problems/reverse-linked-list/
Approach : Recursion
Time Complexity: O(n)
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

    public ListNode reverseList(ListNode head) {

        // Base Case
        if (head == null || head.next == null)
            return head;

        // Reverse remaining list
        ListNode newHead = reverseList(head.next);

        // Reverse current link
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}

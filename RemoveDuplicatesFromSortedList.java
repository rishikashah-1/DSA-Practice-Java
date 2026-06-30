/*
Problem: Merge Two Sorted List
Platform: LeetCode
Difficulty: Easy
https://leetcode.com/problems/merge-two-sorted-lists/
Approach: Two Pointer
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while(temp != null && temp.next != null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
                
            }
            else{
                temp=temp.next;
            }
        }
        
        return head;
    }
}

/*
Problem: Middle of Linked List
Platform: LeetCode
Difficulty: Easy
https://leetcode.com/problems/middle-of-the-linked-list/
Approach: Brute Force
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
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int mid=(count)/2+1;
        temp=head;
        for(int i=1;i<mid;i++){
            temp=temp.next;
        }
        return temp;
    }
}

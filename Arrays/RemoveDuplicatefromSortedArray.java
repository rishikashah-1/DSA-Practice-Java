/*
Problem: Remove Duplicate from Sorted Array
Platform: LeetCode
Difficulty: Easy
Link:https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1926100308/?envType=problem-list-v2&envId=array
Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; // pointer for unique elements
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; // move unique element forward
            }
        }
        return i + 1; // length of unique elements
    }
}

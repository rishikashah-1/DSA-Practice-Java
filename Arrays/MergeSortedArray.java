/*
Problem: Merge Sorted Array
Platform: LeetCode
Difficulty: Easy
Link:https://leetcode.com/problems/merge-sorted-array/description/?envType=problem-list-v2&envId=array
Time Complexity: O(NLogN)
Space Complexity: O(n)
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m,j=0;j<nums2.length;j++){
            nums1[i]=nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}

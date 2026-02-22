/*
Problem:Search Insert Position.
Platform: LeetCode
Difficulty: Easy
Link:https://leetcode.com/problems/search-insert-position/description/?envType=problem-list-v2&envId=array
Time Complexity: O(log(min(n,m)))
Space Complexity: O(1)
*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}

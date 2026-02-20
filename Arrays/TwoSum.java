/*
Problem: Two Sum
Platform: LeetCode
Difficulty: Easy
Link:https://leetcode.com/problems/two-sum/?envType=problem-list-v2&envId=array
Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                return new int[]{i,j};
                
            }
        }
        }
        return new int[]{};
    }
}

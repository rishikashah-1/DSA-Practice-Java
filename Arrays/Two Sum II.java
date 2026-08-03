/*
Problem: Two Sum II
Platform: LeetCode
Difficulty: Medium
https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
Time Complexity: O(nlogn)
Space Complexity: O(1)
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int req=target-nums[i];
            int l=i+1;
            int r=n-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(nums[mid]==req){
                    return new int[]{i+1,mid+1};
                }
                else if(req>nums[mid]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
        return new int[]{-1};
    }
}

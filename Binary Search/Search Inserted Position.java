/*
Problem: Search Inserted Position
Platform: LeetCode
Difficulty: Easy
https://leetcode.com/problems/search-insert-position/
Approach: Binary Search
Time Complexity: O(log(N))

*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0,end=nums.length-1;
        while(s<=end){
            int mid=s+(end-s)/2;
            if(nums[mid]==target){
                return mid;

            }
            if(target>nums[mid]){
                s=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return s;
    }
}

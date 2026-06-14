/*
Problem: Search in Rotated Sorted AArray
Platform: LeetCode
Difficulty: Medium
https://leetcode.com/problems/search-in-rotated-sorted-array/
Approach: Binary Search
Time Complexity: O(log(N))
Space Complexity: O(1)
*/

class Solution {
    public int search(int[] nums, int target) {
        int st=0,end=nums.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[st]<=nums[mid]){
                if(nums[st]<=target && target<nums[mid]){
                       end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
            else{
                if(nums[mid] < target && target <= nums[end]){
                    st=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}

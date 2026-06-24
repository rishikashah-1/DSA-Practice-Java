/*
Problem: Majority Element
Platform: LeetCode
Difficulty: Easy
https://leetcode.com/problems/majority-element/
Approach: Boyer–Moore Voting Algorithm
Time Complexity: O(n)

*/

class Solution {
    public int majorityElement(int[] nums) {
        int cand=nums[0],count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==cand){
                count++;
            }
            else{
                count--;
                if(count==0){
                    cand=nums[i];
                    count++;
                }
            }
        }
        return cand;
    }
}

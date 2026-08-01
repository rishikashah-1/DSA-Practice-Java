/*
Problem:Single Number
Platform: LeetCode
Difficulty: Easy
Link: https://leetcode.com/problems/plus-one/submissions/2078511295/?envType=problem-list-v2&envId=array
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==0){
            return -1;
        }

        for(int i=0;i<nums.length;i++){
            boolean unique=true;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]){
                    unique=false;
                    break;
                }
            }
            if(unique){
                return nums[i];
            }
        }
        return -1;
    }
}

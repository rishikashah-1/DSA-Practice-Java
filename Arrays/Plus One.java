/*
Problem:One Plus
Platform: LeetCode
Difficulty: Easy
Link: https://leetcode.com/problems/plus-one/submissions/2078511295/?envType=problem-list-v2&envId=array
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int[] ans=new int[n+1];
       for(int i=n-1;i>=0;i--){
        if(digits[i]<9){
            digits[i]++;
            return digits;
        }
        digits[i]=0;
        
       } 
       ans[0]=1;
    return ans;
    }
}

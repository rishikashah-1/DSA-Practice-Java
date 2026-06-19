/*
Problem: Valind Palindrome
Platform: LeetCode
Difficulty: Easy
https://leetcode.com/problems/valid-palindrome/
Approach: Two Pointers
Time Complexity: O(n)

*/

class Solution {
    public boolean isPalindrome(String s) {
        String sta=s.replaceAll("[^a-zA-Z0-9]","");
        String str= sta.toLowerCase();
        int st=0,end=str.length()-1;
        while(st<end){
            if(str.charAt(st)!=str.charAt(end)){
              
              return false;
            }
            st++;end--;
            
        }
        return true ;
    }
}

/*
Problem: Fibonacci Number
Platform: LeetCode
Difficulty: Easy
https://leetcode.com/problems/fibonacci-number/description/
Approach : Recursion
Time Complexity: O(n)
*/

class Solution {
    public int fib(int n) {
        if(n<=1)
          return n;
        return fib(n-1)+fib(n-2);
    }
}

/*
Problem: Guess Number Higher or Lower
Platform: LeetCode
Difficulty: Easy
https://leetcode.com/problems/guess-number-higher-or-lower/description/
Approach: Binary Search
Time Complexity: O(log(n)

*/
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int s=1,e=n;
        while(s<=e){
            int mid=s+(e-s)/2;
            guess(mid);
            if(guess(mid)==0){
                return mid;
            }
            else if(guess(mid)==-1){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        
        }
        return -1;
    }
}

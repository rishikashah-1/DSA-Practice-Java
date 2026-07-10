/*
Problem: Fizz Buzz
Platform: LeetCode
Difficulty: Easy
https://leetcode.com/problems/fizz-buzz/
Time Complexity: O(n)
*/

class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> list=new ArrayList<String>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }
            else if(i%3==0){
                list.add("Fizz");
            }
            else if(i%5==0){
                list.add("Buzz");
            }
            else{
                list.add(String.valueOf(i));
            }
        }
        return list;        
            
    }
    
}

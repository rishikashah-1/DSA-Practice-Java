/*
Problem: Roman To Integer
Platform: LeetCode
Difficulty: Easy
https://leetcode.com/problems/roman-to-integer/

Time Complexity: O(n)

*/

class Solution {
    public int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int curr = getValue(ch);

            
            if (i + 1 < s.length()) {
                int next = getValue(s.charAt(i + 1));

                if (curr >= next) {
                    total += curr;  
                } else {
                    total -= curr;   
                }
            } else {
                total += curr;       
            }
        }

        return total;
    }


    private int getValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }


    }

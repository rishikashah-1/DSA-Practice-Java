/*
Problem: Median of Two Sorted Arrays
Platform: LeetCode
Difficulty: Hard
https://leetcode.com/problems/median-of-two-sorted-arrays/?envType=problem-list-v2&envId=array
Approach: Merge Sort
Time Complexity: O(log(min(n,m)))
Space Complexity: O(1)
*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] merged=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                merged[k++]=nums1[i++];

            }else{
                merged[k++]=nums2[j++];
            }
        }
        while(i<m){
            merged[k++]=nums1[i++];

        }
        while(j<n){
            merged[k++]=nums2[j++];

        }
        int l=m+n;
        if(l%2!=0){
             int index=(0+l)/2;
             return merged[index];
        }
        else{
            return (merged[(l/2)-1]+merged[l/2])/2.0;
        }
    }
}

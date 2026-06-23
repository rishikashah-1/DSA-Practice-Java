/*
Problem: Sort Array
Platform: LeetCode
Level:Easy
Approach: Merge Sort
Time Complexity: O(nlogn)

*/

class Solution {

    public int[] sortArray(int[] nums) {
        mergesort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergesort(int[] nums, int st, int end) {
        if (st >= end) {
            return;
        }

        int mid = st + (end - st) / 2;

        mergesort(nums, st, mid);
        mergesort(nums, mid + 1, end);

        merge(nums, st, mid, end);
    }

    private void merge(int[] nums, int st, int mid, int end) {
        int[] temp = new int[end - st + 1];

        int i = st;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= end) {
            temp[k++] = nums[j++];
        }

        for (i = st, k = 0; i <= end; i++, k++) {
            nums[i] = temp[k];
        }
    }
}
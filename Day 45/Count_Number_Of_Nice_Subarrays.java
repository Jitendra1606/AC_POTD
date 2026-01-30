class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums, k - 1);
    }

    public int atmost(int[] nums, int k) {
        int left = 0, n = nums.length, cnt = 0, max = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] % 2 != 0) {
                cnt++;
            }
            while (cnt > k) {
                if (nums[left] % 2 != 0) {
                    cnt--;
                }
                left++;
            }
            max = max + (right - left + 1);
        }
        return max;
    }
}
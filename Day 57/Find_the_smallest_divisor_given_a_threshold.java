class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        int low = 1, high = max;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isdivisor(nums, mid, threshold)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public boolean isdivisor(int[] nums, int mid, int threshold) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.ceil((double) nums[i] / mid);
        }
        return sum <= threshold;
    }
}
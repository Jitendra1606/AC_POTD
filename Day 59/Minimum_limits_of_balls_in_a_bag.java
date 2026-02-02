class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int n = nums.length, max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
        }
        int low = 1, high = max, res = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (maxpossible(nums, maxOperations, mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    public boolean maxpossible(int[] nums, int maxOperations, int mid) {
        int total_ops = 0;
        for (int i = 0; i < nums.length; i++) {
            int ops = nums[i] / mid;
            if (nums[i] % mid == 0) {
                ops -= 1;
            }
            total_ops += ops;
            if (total_ops > maxOperations) {
                return false;
            }
        }
        return true;
    }
}
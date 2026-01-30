class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return true;
            if (nums[low] == nums[mid] && nums[high] == nums[mid]) {
                low = low + 1;
                high = high - 1;
                continue;
            }
            // if left part is sorted
            if (nums[low] <= nums[mid]) {// we need to further check if target is present in this part also or not
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
                // if right part is sorted
            } else {// if(nums[mid] <= nums[high])
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}
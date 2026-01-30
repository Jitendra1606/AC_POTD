
class Solution {
    public long repairCars(int[] ranks, int cars) {
        long max = 0;
        int n = ranks.length;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, 1L * ranks[i] * cars * cars);
        }
        long low = 1, high = max;
        long ans = high;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (ispossible(ranks, mid, cars)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public boolean ispossible(int[] ranks, long mid, long cars) {
        long sum = 0;
        for (int i = 0; i < ranks.length; i++) {
            sum = sum + (long) Math.sqrt(mid / ranks[i]);
            if (sum >= cars)
                return true;
        }
        return false;
    }
}
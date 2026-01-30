class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE, n = weights.length, sum = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, weights[i]);
            sum = sum + weights[i];
        }
        // bcz low can be the max number of weight it can bear and max can be the sum of
        // all the weights
        int low = max, high = sum;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int noofday = func(weights, mid);
            if (noofday <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int func(int[] weights, int cap) {
        int day = 1, load = 0;
        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > cap) {
                day = day + 1;
                load = weights[i];
            } else {
                load = load + weights[i];
            }
        }
        return day;
    }
}
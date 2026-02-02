class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = maximum(piles), low = 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long tothour = totalhours(piles, mid);
            if (tothour <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public long totalhours(int[] piles, int k) {
        long tot = 0;
        int n = piles.length;
        for (int i = 0; i < n; i++) {
            tot += (piles[i] + k - 1) / k;
        }
        return tot;
    }

    public int maximum(int[] piles) {
        int max = Integer.MIN_VALUE;
        int n = piles.length;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, piles[i]);
        }
        return max;
    }
}
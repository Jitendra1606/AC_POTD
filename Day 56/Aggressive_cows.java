class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 1, high = stalls[n - 1] - stalls[0];
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ispossible(stalls, mid, k)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public boolean ispossible(int[] stalls, int mid, int k) {
        int cntcows = 1, last = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - last >= mid) {
                cntcows++;
                last = stalls[i];
            }
        }
        return (cntcows >= k);
    }
}
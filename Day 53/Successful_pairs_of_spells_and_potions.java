class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];
        for (int i = 0; i < n; i++) {
            int low = 0, high = m - 1;
            int ans = m;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (spells[i] * 1L * potions[mid] * 1L >= success) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            pairs[i] = m - ans;
        }
        return pairs;
    }
}
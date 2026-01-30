class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int i = 0, j = 0, sum = 0;
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        while (j < n) {
            sum = sum + arr[j];
            if ((j - i + 1) < k) {
                j++;
            } else {
                max = Math.max(max, sum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
}
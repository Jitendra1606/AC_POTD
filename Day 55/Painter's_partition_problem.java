class Solution {
    public int minTime(int[] arr, int k) {
        int n = arr.length;
        if (n < k)
            return -1;
        int sum = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }
        int low = max, high = sum;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int painters = noofpainter(arr, mid);
            if (painters > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public int noofpainter(int[] arr, int mid) {
        int painter = 1, paintboard = 0;
        for (int i = 0; i < arr.length; i++) {
            if (paintboard + arr[i] <= mid) {
                paintboard = paintboard + arr[i];
            } else {
                painter++;
                paintboard = arr[i];
            }
        }
        return painter;
    }
}

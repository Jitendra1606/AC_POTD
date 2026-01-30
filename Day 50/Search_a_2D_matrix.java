class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        // we don't need to use any extra array, we can directly access elements in
        // binary search
        int[] ans = new int[m * n];
        for (int i = 0; i < m * n; i++) {
            ans[i] = matrix[i / n][i % n];
        }
        int s = 0, e = m * n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (ans[mid] == target) {
                return true;
            } else if (target < ans[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return false;
    }
}

// optimized version
// class Solution {
// public boolean searchMatrix(int[][] matrix, int target) {
// int m = matrix.length;
// int n = matrix[0].length;
// int s = 0, e = m * n - 1;
// while (s <= e) {
// int mid = s + (e - s) / 2;
// int val = matrix[mid / n][mid % n];
// if (val == target) return true;
// else if (target < val) e = mid - 1;
// else s = mid + 1;
// }
// return false;
// }
// }

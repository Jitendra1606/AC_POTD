class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int low = 0, high = m - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = maxindex(mat, n, m, mid);
            int left = mid - 1 >= 0 ? mat[row][mid - 1] : -1;
            int right = mid + 1 < m ? mat[row][mid + 1] : -1;
            if (mat[row][mid] > left && mat[row][mid] > right) {
                return new int[] { row, mid };
            } else if (mat[row][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }

    // we need to find max element in this col, which also gives us the index of row
    public int maxindex(int[][] mat, int n, int m, int mid) {
        int max = -1, ind = -1;
        for (int i = 0; i < n; i++) {
            if (mat[i][mid] > max) {
                max = mat[i][mid];
                ind = i;
            }
        }
        return ind;
    }
}
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int k = original.length;
        int[][] arr = new int[m][n];
        int count = 0;
        if (k != m * n)
            return new int[][] {};// checking edge case
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = original[count];
                count++;
            }
        }
        return arr;
    }
}
// Time complexity-- O(m * n)

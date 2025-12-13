class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> List = new ArrayList<>();
        int top = 0;
        int right = m - 1;
        int bottom = n - 1;
        int left = 0;
        while(top <= bottom && left <= right){
            for(int col = left ; col <= right ; col++){
                List.add(matrix[top][col]);
            }
            top++;
            for(int row = top ; row <= bottom ; row++){
                List.add(matrix[row][right]);
            }
            right--;

            if(top <= bottom) {
            for(int col = right ; col >= left ; col--){
                List.add(matrix[bottom][col]);
               }
               bottom--;
            }

            if(left <= right){
            for(int row = bottom ; row >= top ; row--){
                List.add(matrix[row][left]);
                }
                left++;
            }
        }
        return List;
    }
}
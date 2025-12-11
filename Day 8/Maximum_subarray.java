// class Solution {
//     public int maxSubArray(int[] nums) {
//         int max = Integer.MIN_VALUE;
//         for(int i = 0 ; i < nums.length ; i++ ){
//             int sum = 0;
//             for(int j = i  ; j < nums.length ; j++ ){
//             sum = sum + nums[j];
//                 if(sum > max){
//                    max = sum;
//                 }
//             }
//         } 
//         return max;
//     } 
// }  

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int currentSum = nums[0];
//         int maxSum = nums[0];
//         for (int i = 1; i < nums.length; i++) {
//             // Decide: start new subarray or continue existing one
//             currentSum = Math.max(nums[i], currentSum + nums[i]);
//             // Track global maximum
//             maxSum = Math.max(maxSum, currentSum);
//         }
//         return maxSum;
//     }
// }

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
// Time Complexity: O(n)
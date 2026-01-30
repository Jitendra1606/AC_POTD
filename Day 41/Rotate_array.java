class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
// Time complexity -- O(n)

// class Solution{
// public void rotate(int[] nums, int k){
// reverse(nums, k);
// }
// public int[] reverse(int[] arr , int k){
// int n = arr.length;
// for(int i = 0 ; i < k ; i++){
// int last = arr[n - 1];
// for(int j = n - 1 ; j > 0 ; j--){
// arr[j] = arr[j - 1];
// }
// arr[0] = last;
// }
// return arr;
// }
// }
// TLE at case 39/40
// Time complexity - O(n*k)
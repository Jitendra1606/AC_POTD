class Solution {
    public int splitArray(int[] nums, int k) {
        int sum = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            max = Math.max(max, nums[i]);
        }
        int low = max, high = sum;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int large = splitarr(nums, mid);
            if (large > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public int splitarr(int[] nums, int mid) {
        int sub = 1, totalsplit = 0;
        for (int i = 0; i < nums.length; i++) {
            if (totalsplit + nums[i] <= mid) {
                totalsplit = totalsplit + nums[i];
            } else {
                sub++;
                totalsplit = nums[i];
            }
        }
        return sub;
    }
}

// kunal's solution
// class Solution {
// public int splitArray(int[] nums, int k) {
// int start = 0;
// int end = 0;

// for(int i = 0; i < nums.length ; i++){
// start = Math.max(start, nums[i]); //in the end of the loop this will contain
// the max item from the array
// end = end + nums[i];
// }

// //binary search
// while(start < end){
// //try for the middle as potential ans
// int mid = start + (end - start)/2;

// //calculate how many pieces you can divide this in with this max sum
// int sum = 0;
// int pieces = 1;
// for(int num : nums){
// if(sum + num > mid){
// //you cannot add this in this subarray, make new one
// //say you add this num in new subarray , then sum = num
// sum = num;
// pieces++;
// } else {
// sum += num;
// }
// }
// if(pieces > k){
// start = mid + 1;
// }else {
// end = mid;
// }
// }
// return end; //here start == end
// }
// }
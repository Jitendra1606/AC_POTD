// class Solution {
//     public void moveZeroes(int[] nums) {
//         int n = nums.length;
//         ArrayList<Integer> List = new ArrayList<>(n); //creating a arraylist to contain values
//         for(int i = 0 ; i < n ; i++){
//             if(nums[i] != 0){   //checking if value is != 0
//                 List.add(nums[i]); //adding it to our arraylist
//             }
//         }
//         int ind = 0;   //initialising index value to 0
//         for(int i = 0 ; i < List.size() ; i++){
//             nums[ind] = List.get(i);  // storing value of arraylist again to the nums array
//             ind++;
//         }
//         while(ind < n){    //now adding 0 at the end of the array because it has only non zero no.
//             nums[ind] = 0;
//             ind++;         //incrementing till the size of array
//         }
//     }
// }

// // Time complexity -- O(N)

//have to do with given array only not creating copy of the array
class Solution {
    public void moveZeroes(int[] nums) {
        // int j = 0;
        // for(int i = 0 ; i < nums.length ; i++){
        // if(nums[i] != 0){
        // nums[j] = nums[i];
        // j++;
        // }
        // }
        int i = 0, j = 1;
        while (j < nums.length) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}
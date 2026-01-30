//Time limit exceeded
// class Solution {
//     static boolean pairInSortedRotated(int arr[], int target) {
//         for(int i = 0 ; i < arr.length ; i++){
//             for(int j = i + 1 ; j < arr.length ; j++){
//                 if(arr[i] + arr[j] == target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

//optimal way--->
class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (map.containsKey(target - num)) {
                return true;
            }
            map.put(num, i);
        }
        return false;
    }
}

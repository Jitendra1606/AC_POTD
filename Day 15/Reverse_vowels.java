
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while(left < right){//if it is a consonant then complemet make it true and then this while loop will implement and left will increment
            while(left < right && !isvowel(arr[left])){
                left++;
            }
            while(left < right && !isvowel(arr[right])){
                right--;
            }
            //if both while loop does not execute then this swapping will
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    public boolean isvowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}

// class Solution {
//     public String reverseVowels(String s) {
//         char[] arr = s.toCharArray();
//         int n = arr.length;
//         int right = n - 1;
//         for(int i = 0 ; i < n / 2 ; i++){
//             if(isvowel(arr[i])){
//                 while(right > i && !isvowel(arr[right])){
//                    right--;
//                 }
//                 if(right > i){
//                     swap(arr, i , right);
//                     right--;
//                 } 
//             }
//         }
//         return new String(arr);
//     }
// //test case failed at 476/480
//     public void swap(char[] arr, int i , int j){
//         char temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public boolean isvowel(char c){
//         return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
//     }
// }


//     public boolean isvowel(char c){
//         return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
//     }
// } initial approach but failing

// class Solution {
//     public String reverseVowels(String s) {
//         char[] arr = s.toCharArray();
//         int n = arr.length;
//         for(int i = 0 ; i < n / 2 ; i++){
//             if(isvowel(arr[i])){
//                  for(int j = n - 1 ; j >= n / 2 + 1 ; j--){
//                     if(isvowel(arr[j])){
//                         swap(arr,i,j);
//                         break;
//                     }
//                 }
//             }
//         }
//         return new String(arr);
//     }

//     public void swap(char[] arr, int i , int j){
//         char temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public boolean isvowel(char c){
//         return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
//     }
// } initial approach but failing
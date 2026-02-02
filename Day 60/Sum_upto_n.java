class Solution {
    public static int findSum(int n) {
        return n * (n + 1) / 2;
    }
}
// class Solution{
// public static int findSum(int n){
// if(n == 0) return 0;

// return (n + findSum(n - 1));
// }
// }

// class Solution {
// public static int findSum(int n) {
// if(n == 0){
// return 0;
// }
// int sum = 0;
// for(int i = 1 ; i <= n ; i++){
// sum += i;
// }
// return sum;
// }
// }
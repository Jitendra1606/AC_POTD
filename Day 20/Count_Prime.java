// class Solution {
//     public int countPrimes(int i) {
//         if(i < 2) return 0;
//         int cnt = 0;
//         for(int j = 2 ; j < i ; j++){
//             if(isprime(j)) cnt++;
//         }
//         return cnt;
//     }
//     public boolean isprime(int n){
//         if(n < 2) return false;
//         for(int i = 2 ; i * i <= n ; i++){
//             if(n % i == 0) return false;
//         }
//         return true;
//     }
// } simple brute force approach not good for big test cases

class Solution {
    public int countPrimes(int n) {
        if (n < 2)
            return 0;
        boolean[] isprime = new boolean[n];
        for (int i = 2; i < n; i++)
            isprime[i] = true;
        for (int i = 2; i * i < n; i++) {
            if (isprime[i]) {
                for (int j = i * i; j < n; j = j + i) {
                    isprime[j] = false;
                }
            }
        }
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (isprime[i])
                cnt++;
        }
        return cnt;
    }
}
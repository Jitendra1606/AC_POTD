// class Solution {
//     public double myPow(double x, int n) {
//         if(n == 0){
//             return 1;
//         }
//         if(n < 0){
//             return 1 / myPow(x , -n);
//         }
//         return x * myPow(x , n - 1);
//     }
// }

class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long m = n;
        if (n < 0) {
            m = -m;
        }
        while (m > 0) {
            if (m % 2 == 0) {
                x = x * x;
                m = m / 2;
            } else {
                ans = ans * x;
                m = m - 1;
            }
        }
        if (n < 0)
            ans = (double) (1.0) / (ans);
        return ans;
    }
}
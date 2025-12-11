class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // if (dig<9) add 1
                return digits; // if not < 9 return
            }
            digits[i] = 0;
        }

        int[] result = new int[n + 1];// this case will come when all the digits are 9 [9,9]
        result[0] = 1; // so here we just have to put 1 at 0th index and all other elements are 0
        return result;
    }
}
// Time Complexity -- O(N)
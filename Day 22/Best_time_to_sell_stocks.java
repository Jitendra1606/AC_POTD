//(runtime -- 0ms)
// class Solution{
//     public int maxProfit(int[] prices){
//         int n = prices.length;
//         int max = 0;
//         int min = prices[0];
//         for(int i = 1 ; i < n ; i++){
//             int cost = prices[i] - min;
//             max = Math.max(cost , max);
//             min = Math.min(min , prices[i]);
//         }
//         return max;
//     }
// }

//another way (runtime -- 1ms)
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            } else {
                maxprofit = Math.max(maxprofit, prices[i] - min);
            }
        }
        return maxprofit;
    }
}
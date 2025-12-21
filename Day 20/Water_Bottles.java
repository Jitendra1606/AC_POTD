
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int sum = numBottles;
        while (numBottles >= numExchange) {
            int newbottle = numBottles / numExchange;
            sum = sum + newbottle;
            numBottles = newbottle + (numBottles % numExchange);
        }

        return sum;
    }
}
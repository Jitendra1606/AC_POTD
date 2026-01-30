class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < gifts.length; i++) {
            queue.offer(gifts[i]);
        }
        while (k > 0) {
            int max = queue.poll();
            int red = (int) Math.sqrt(max);
            queue.offer(red);
            k--;
        }
        long sum = 0;
        while (!queue.isEmpty()) {
            sum = sum + queue.poll();
        }
        return sum;
    }
}
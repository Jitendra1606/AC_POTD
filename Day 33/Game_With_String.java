class Solution {
    public int minValue(String s, int k) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()) {
            pq.offer(it.next());
        }
        for (int i = 1; i <= k; i++) {
            int newv = pq.poll() - 1;
            pq.offer(newv);
        }
        int sum = 0;
        while (!pq.isEmpty()) {
            int sq = pq.poll();
            sum = sum + (sq * sq);
        }
        return sum;
    }
}
class Solution {
    public String firstNonRepeating(String s) {
        Queue<Character> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'a']++;// updating count
            q.offer(c);// adding to queue
            // remove all chars from front that are repeating
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.poll();
            }
            if (q.isEmpty()) {
                sb.append('#');
            } else {
                sb.append(q.peek());
            }
        }
        return sb.toString();
    }
}
// didn't get it properly
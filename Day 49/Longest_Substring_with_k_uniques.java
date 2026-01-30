class Solution {
    public int longestKSubstr(String s, int k) {
        int left = 0, right = 0, max = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < n) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.size() > k) {
                char leftchar = s.charAt(left);
                map.put(leftchar, map.get(leftchar) - 1);
                if (map.get(leftchar) == 0) {
                    map.remove(leftchar);
                }
                left++;
            }
            if (map.size() == k) {
                max = Math.max(max, right - left + 1);
            }
            right++;
        }
        return map.size() < k ? -1 : max;
    }
}
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                if (start > 0) {
                    str.append(c);
                }
                start++;
            } else {
                start--;
                if (start > 0) {
                    str.append(c);
                }
            }
        }
        return str.toString();
    }
}
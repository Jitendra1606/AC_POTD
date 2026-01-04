class Solution {
    public static String infixToPostfix(String infix) {
        String ans = "";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') ||
                    (ch >= 'a' && ch <= 'z') ||
                    (ch >= '0' && ch <= '9')) {
                ans = ans + ch;
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans = ans + st.pop();
                }
                st.pop();
            } else {
                while (!st.isEmpty() && st.peek() != '(' && (priority(st.peek()) > priority(ch)
                        || (priority(st.peek()) == priority(ch) && ch != '^'))) {
                    ans = ans + st.pop();
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            ans = ans + st.pop();
        }
        return ans;
    }

    static int priority(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '^') {
            return 3;
        } else {
            return -1;
        }
    }
}

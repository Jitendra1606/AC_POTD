class Solution {
    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            // if it is operand
            if (!s.equals("+") && !s.equals("/") && !s.equals("*") && !s.equals("-") && !s.equals("^")) {
                st.push(Integer.parseInt(s));
            } else {
                int b = st.pop();
                int a = st.pop();
                int res = 0;
                switch (s) {
                    case "+":
                        res = (a + b);
                        break;
                    case "-":
                        res = (a - b);
                        break;
                    case "*":
                        res = (a * b);
                        break;
                    case "/":
                        res = a / b;
                        // adjust for negative division floor
                        if (a % b != 0 && ((a * b) < 0))
                            res--;
                        break;
                    case "^":
                        res = (int) Math.pow(a, b);
                        break;
                }
                st.push(res);
            }
        }
        return st.pop();
    }
}
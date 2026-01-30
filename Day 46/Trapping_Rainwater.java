class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        int[] ngr = new int[n];
        int[] ngl = new int[n];
        int[] premax = new int[n];
        int[] sufmax = new int[n];
        // next greater to left
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ngr[i] = -1;
            } else {
                ngr[i] = arr[st.peek()];
            }
            st.push(i);
        }
        // prefix max of array
        premax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            premax[i] = Math.max(premax[i - 1], arr[i]);
        }
        // next greater to right
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ngl[i] = -1;
            } else {
                ngl[i] = arr[st.peek()];
            }
            st.push(i);
        }
        // suffix max of array
        sufmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sufmax[i] = Math.max(sufmax[i + 1], arr[i]);
        }
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(premax[i], sufmax[i]);
            if (min < 0) {
                ans[i] = 0;
            } else {
                ans[i] = min - arr[i];
            }
            sum = sum + ans[i];
        }
        return sum;
    }
}
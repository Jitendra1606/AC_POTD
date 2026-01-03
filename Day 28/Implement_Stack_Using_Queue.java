class myStack {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        // Inserts an element x at the top of the stack
        int s = q.size();
        q.offer(x);
        for (int i = 1; i <= s; i++) {
            q.offer(q.peek());
            q.poll();
        }
    }

    void pop() {
        // Removes an element from the top of the stack
        if (q.size() == 0) {
            return;
        }
        q.poll();
    }

    int top() {
        // Returns the top element of the stack
        // If stack is empty, return -1
        if (q.size() == 0) {
            return -1;
        }
        return q.peek();
    }

    int size() {
        // Returns the current size of the stack

        return q.size();
    }
}

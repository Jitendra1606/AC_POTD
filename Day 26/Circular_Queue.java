class MyCircularQueue {
    private int[] arr;
    private int start;
    private int end;
    private int size;
    private int capacity;

    public MyCircularQueue(int k) {// constuctor
        arr = new int[k];
        capacity = k;
        start = 0;
        end = -1;
        size = 0;
    }

    public boolean enQueue(int value) {// adding elements
        if (isFull()) {// if queue become full then return false
            return false;
        }
        end = (end + 1) % capacity;
        // fifo, so pop fun removes element from front but push fun add element in last
        // so after pop we've a space left in front and with that modulo we can use this
        // space
        arr[end] = value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        start = (start + 1) % capacity;
        // same concept as for push
        size--;
        return true;
    }

    public int Front() {// gets front element
        if (isEmpty()) {
            return -1;
        }
        return arr[start];
    }

    public int Rear() {// gets last element
        if (isEmpty()) {
            return -1;
        }
        return arr[end];
    }

    public boolean isEmpty() {// checks if queue is empty
        return size == 0;
    }

    public boolean isFull() {// checks if queue is full
        return size == capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
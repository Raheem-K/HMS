public class queue <T> {
    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Object[] getQueues() {
        return queues;
    }

    public void setQueues(Object[] queues) {
        this.queues = queues;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private int max;
    private Object[] queues;
    private int front;
    private int rear;
    private int size;

    public queue(int max) {
        this.max = max;
        this.queues = new Object[max];
        this.front = -1;
        this.rear = -1;

    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == max - 1;
    }

    public void enqueue(T queue) {
        if (isFull()) {
            System.out.println("Queue is full. ");
            return;
        }
        if (isEmpty()) {
            front++;
        }
        queues[++rear] = queue;

    }

    public T dequeue() {
        if (isEmpty() || front > rear) {
            System.out.println("empty");
            return null;

        }
        T queue = (T) queues[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }

        return queue;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. ");
            return;
        }
        System.out.println(queues[front]);
    }

    public int size() {
        return rear - front + 1;
    }

    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        return (T) queues[front + index];
    }

//    public int size() {
//        return this.size;
//    }
//
//    public T get(int index) {
//        if (index < 0 || index >= size) {
//            throw new IndexOutOfBoundsException("Index is out of bounds.");
//        }
//        int actualIndex = (front + index) % max;
//        return (T) queues[actualIndex];
//    }
//
//    public T[] toArray() {
//        T[] array = (T[]) new Object[size];
//        for (int i = 0; i < size; i++) {
//            int actualIndex = (front + i) % max;
//            array[i] = (T) queues[actualIndex];
//        }
//        return array;
//    }

//    public void display() {
//        if (isEmpty()) {
//            System.out.println("Queue is empty");
//        } else {
//            for (int i = 0; i < size; i++) {
//                int index = (front + i) % queues.length;
//                System.out.print(queues[index] + " ");
//            }
//            System.out.println();
//        }
//
//    }
}
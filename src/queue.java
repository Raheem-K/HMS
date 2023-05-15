public class queue <T>{
    private int max ;
    private Object[] queues;
    private int front;
    private int rear;
    private int size;

    public queue(int max) {
        this.max=max;
        this.queues = new Object[max];
        this.front = -1;
        this.rear = -1;

    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == max-1;
    }

    public void enqueue(T queue) {
        if (isFull()) {
            System.out.println("Queue is full. ");
            return;
        }
        if (isEmpty()){
            front++;
        }
        queues[++rear] = queue;

    }

    public T dequeue() {
        if (isEmpty()||front>rear ) {
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
        System.out.println("Element: "+queue);
        return null;
    }

    public void peek() {
        if (isEmpty() ) {
            System.out.println("Queue is empty. ");
            return;
        }
        System.out.println(queues[front]);
    }

//    public void display() {
//        if (isEmpty()) {
//            System.out.println("Queue is empty");
//        } else {
//            for (int i = 0; i < size; i++) {
//                int index = (front + i) % queue.length;
//                System.out.print(queue[index] + " ");
//            }
//            System.out.println();
//        }
}
package Work08;

class ArrayQueue {
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int capacity) {
        queueArray = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    // 入队
    public void enqueue(int element) {
        if (size == queueArray.length) {
            System.out.println("队列已满，无法入队：" + element);
            return;
        }

        queueArray[rear] = element;
        rear = (rear + 1) % queueArray.length;
        size++;

        System.out.println("入队元素：" + element);
    }

    // 出队
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("队列是空的，无法出队");
        }

        int element = queueArray[front];
        front = (front + 1) % queueArray.length;
        size--;

        return element;
    }

    // 判断队列是否为空
    public boolean isEmpty() {
        return size == 0;
    }
}

public class Homework04 {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
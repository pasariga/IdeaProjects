package Work08;

class ArrayStack {
    private int[] stackArray;
    private int top;

    public ArrayStack(int capacity) {
        stackArray = new int[capacity];
        top = -1;
    }

    // 入栈
    public void push(int element) {
        if (top == stackArray.length - 1) {
            System.out.println("栈已满，无法入栈：" + element);
            return;
        }

        top++;
        stackArray[top] = element;
        System.out.println("入栈元素：" + element);
    }

    // 出栈
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈是空的，无法出栈");
        }

        int element = stackArray[top];
        top--;
        return element;
    }

    // 判断栈是否为空
    public boolean isEmpty() {
        return top == -1;
    }
}

public class Homework03 {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
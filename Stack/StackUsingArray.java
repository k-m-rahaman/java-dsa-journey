public class StackUsingArray {

    int maxSize = 5;
    int[] stack = new int[maxSize];
    int top = -1;

    public void push(int data) {

        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = data;
    }

    public int pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return stack[top--];
    }

    public int peek() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return stack[top];
    }

    public void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        StackUsingArray stack = new StackUsingArray();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top Element = " + stack.peek());

        stack.display();
    }
}
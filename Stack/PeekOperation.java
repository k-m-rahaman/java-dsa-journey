public class PeekOperation {

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

    public int peek() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return stack[top];
    }

    public static void main(String[] args) {

        PeekOperation stack = new PeekOperation();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top Element = " + stack.peek());
    }
}
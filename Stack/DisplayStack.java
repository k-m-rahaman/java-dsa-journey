public class DisplayStack {

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

    public void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack Elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        DisplayStack stack = new DisplayStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();
    }
}
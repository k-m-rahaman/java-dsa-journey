public class PushOperation {

    int maxSize = 5;
    int[] stack = new int[maxSize];
    int top = -1;

    public void push(int data) {

        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = data;

        System.out.println(data + " pushed into Stack");
    }

    public void display() {

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        PushOperation stack = new PushOperation();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();
    }
}
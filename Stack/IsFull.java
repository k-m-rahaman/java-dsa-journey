public class IsFull {

    int maxSize = 5;
    int[] stack = new int[maxSize];
    int top = -1;

    public void push(int data) {

        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = data;
    }

    public boolean isFull() {

        return top == maxSize - 1;
    }

    public static void main(String[] args) {

        IsFull stack = new IsFull();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Is Stack Full? " + stack.isFull());

        stack.push(60);
    }
}
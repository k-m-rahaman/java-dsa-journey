public class IsEmpty {

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

    public boolean isEmpty() {

        return top == -1;
    }

    public static void main(String[] args) {

        IsEmpty stack = new IsEmpty();

        System.out.println("Is Stack Empty? " + stack.isEmpty());

        stack.push(10);

        System.out.println("Is Stack Empty? " + stack.isEmpty());
    }
}
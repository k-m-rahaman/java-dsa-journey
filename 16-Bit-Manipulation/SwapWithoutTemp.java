public class SwapWithoutTemp {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}

// Before swap: a = 10, b = 20
// After swap: a = 20, b = 10


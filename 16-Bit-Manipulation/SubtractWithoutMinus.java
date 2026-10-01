// Subtraction can also be performed using two's complement.

// For a - b:
// a + (~b + 1)

public class SubtractWithoutMinus {

    static int subtract(int a, int b) {

        return add(a, add(~b, 1));
    }

    static int add(int a, int b) {

        while (b != 0) {

            int carry = (a & b) << 1;

            a = a ^ b;
            b = carry;
        }

        return a;
    }

    public static void main(String[] args) {

        int a = 50;
        int b = 18;

        System.out.println("Difference: " + subtract(a, b));
    }
}

// Difference: 32



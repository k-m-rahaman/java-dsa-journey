// We can add two numbers without using +.

// XOR gives addition without carry
// AND followed by left shift gives the carry
// Repeat until carry becomes 0

public class AddWithoutPlus {

    static int add(int a, int b) {

        while (b != 0) {

            int carry = (a & b) << 1;

            a = a ^ b;
            b = carry;
        }

        return a;
    }

    public static void main(String[] args) {

        int a = 15;
        int b = 27;

        System.out.println("Sum: " + add(a, b));
    }
}

// Sum: 42


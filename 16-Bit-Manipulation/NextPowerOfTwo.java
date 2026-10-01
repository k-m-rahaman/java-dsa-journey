// Find the smallest power of 2 greater than or equal to a number.
public class NextPowerOfTwo {

    static int nextPowerOfTwo(int number) {

        if (number <= 1) {
            return 1;
        }

        number--;

        number |= number >> 1;
        number |= number >> 2;
        number |= number >> 4;
        number |= number >> 8;
        number |= number >> 16;

        return number + 1;
    }

    public static void main(String[] args) {

        int number = 19;

        System.out.println(
            "Next power of two: " + nextPowerOfTwo(number)
        );
    }
}

// Output
// Next power of two: 32
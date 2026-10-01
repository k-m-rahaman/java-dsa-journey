// Gray code is generated using:

// gray = n ^ (n >> 1)

// It converts a binary number into its corresponding Gray code.

public class GrayCode {

    static int binaryToGray(int number) {
        return number ^ (number >> 1);
    }

    public static void main(String[] args) {

        int number = 7;

        int gray = binaryToGray(number);

        System.out.println("Binary number: " + number);
        System.out.println("Gray code: " + gray);
    }
}

// Output
// Binary number: 7
// Gray code: 4

// For 7:

// Binary: 111
// Gray:   100

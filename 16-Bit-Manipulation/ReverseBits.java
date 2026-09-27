public class ReverseBits {

    static int reverseBits(int number) {

        int result = 0;

        for (int i = 0; i < 32; i++) {

            result <<= 1;
            result |= (number & 1);

            number >>>= 1;
        }

        return result;
    }

    public static void main(String[] args) {

        int number = 43261596;

        int reversed = reverseBits(number);

        System.out.println(
            "Reversed bits: " + Integer.toUnsignedLong(reversed)
        );
    }
}
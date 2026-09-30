public class CheckBitPower {

    static boolean isPowerOfTwo(int number) {

        return number > 0 && (number & (number - 1)) == 0;
    }

    public static void main(String[] args) {

        int number = 16;

        System.out.println(
            number + " is power of two: " + isPowerOfTwo(number)
        );
    }
}